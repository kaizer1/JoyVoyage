//
// Created by loskutnikov on 22.06.2020.
//

#include "httpsLos.h"
#include <curl/curl.h>


//explicit httpsLos(const std::string& canPath);
//httpsLos(const httpsLos&) = delete;
//~httpsLos();
//
//void operator=(const httpsLos&) = delete;
//
//
//std::optional<std::string> get(const std::string& url, std::string* error) const;
//
//private:
//const std::string canPatj;

using namespace std::string_literals;

httpsLos::httpsLos(const std::string & canPath) :  canPatj(canPath){
    curl_global_init(CURL_GLOBAL_DEFAULT);
}

size_t write_fn(char* data, size_t size, size_t nmemb, void* user_data) {
    assert(user_data != nullptr);
    std::string* buffer = reinterpret_cast<std::string*>(user_data);
    buffer->append(data, size * nmemb);
    return size * nmemb;
    }

httpsLos::~httpsLos() { curl_global_cleanup(); }

std::optional<std::string> httpsLos::get(const std::string &url, std::string *error) const {
    std::string placeholder;
    if(error == nullptr){
        error = &placeholder;
    }

    std::unique_ptr<CURL, decltype(&curl_easy_cleanup)> curl(curl_easy_init(), curl_easy_cleanup);

    if(curl == nullptr){
        *error = "Failed to create CURL object";
        return std::nullopt;
    }



//    D/NetworkSecurityConfig: No Network Security Config specified, using platform default
//        2020-06-22 10:38:39.886 32722-32722/dug.morn.night.prego I/gamestestLOS:  error and not callback = easy_perform: Problem with the SSL CA cert (path? access rights?)

    CURLcode rs = curl_easy_setopt(curl.get(), CURLOPT_URL, url.c_str());
    if(rs != CURLE_OK){
        *error = "CURLOPT_URL failed:"s + curl_easy_strerror(rs);
        return std::nullopt;
    }

    rs = curl_easy_setopt(curl.get(), CURLOPT_SSL_VERIFYPEER, false);


    rs = curl_easy_setopt(curl.get(), CURLOPT_VERBOSE, 1L);
    if(rs != CURLE_OK){
        *error = "CURLOPT_URL3 failed:"s + curl_easy_strerror(rs);
        return std::nullopt;
    }

//    rs = curl_easy_setopt(curl.get(), CURLOPT_CAINFO, canPatj.c_str());
//    if(rs != CURLE_OK){
//        *error = "CURLOPT_URL 2 failed:"s + curl_easy_strerror(rs);
//        return std::nullopt;
//    }

    rs = curl_easy_setopt(curl.get(), CURLOPT_WRITEFUNCTION, write_fn);
    if (rs != CURLE_OK) {
        *error = "CURLOPT_WRITEFUNCTION:"s + curl_easy_strerror(rs);
        return std::nullopt;
    }

    std::string buffer;
    rs = curl_easy_setopt(curl.get(), CURLOPT_WRITEDATA,
                           reinterpret_cast<void*>(&buffer));
    if (rs != CURLE_OK) {
        *error = "CURLOPT_WRITEDATA: "s + curl_easy_strerror(rs);
        return std::nullopt;
    }

    rs = curl_easy_setopt(curl.get(), CURLOPT_FOLLOWLOCATION, 1L);
    if (rs != CURLE_OK) {
        *error = "CURLOPT_FOLLOWLOCATION: "s + curl_easy_strerror(rs);
        return std::nullopt;
    }

    rs = curl_easy_perform(curl.get());
    if (rs != CURLE_OK) {
        *error = "easy_perform: "s + curl_easy_strerror(rs);
        return std::nullopt;
    }

return buffer;
}


























