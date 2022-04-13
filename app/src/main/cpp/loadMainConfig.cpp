//
// Created by loskutnikov on 17.06.2020.
//

#include <jni.h>
#include <iostream>
#include <sstream>
#include <firebase/app.h>
#include <firebase/remote_config.h>
#include <firebase/util.h>
#include <android/log.h>
#include <algorithm>
#include <future>
#include <thread>

#include <json/json.h>
#include <json/reader.h>
#include "httpsLos.h"

#define runLogging(...) ((void)__android_log_print(ANDROID_LOG_INFO, "gamestestLOS", __VA_ARGS__))


bool ProcessEvents(int msec);



extern "C" JNIEXPORT jstring JNICALL
Java_dug_morn_night_prego_Msdkjhqcb_stringFromJNI(JNIEnv *env, jobject thiz, jstring addressString) {
    // TODO: implement stringFromJNI()


//     firebase::App dfw = firebase::App();

//     ::firebase::App* app;
//    app = ::firebase::App::Create(env, thiz);
//
//    ::firebase::ModuleInitializer initializer;
//    initializer.Initialize(app, nullptr, [](::firebase::App* app, void*){
//        runLogging(" thiss initialize \n");
//        return ::firebase::remote_config::Initialize(*app);
//    });
//
//    while(initializer.InitializeLastResult().status() != firebase::kFutureStatusComplete){
//        runLogging(" hhhhh hhh h \n");
//    }
//    if(initializer.InitializeLastResult().error() != 0){
//        runLogging(" my mistake init == %s \n", initializer.InitializeLastResult().error_message());
//    }
//    auto future_result = firebase::remote_config::Fetch(0);


    //::firebase::remote_config::Initialize(*app);
    Json::Value ddl;
    std::string aNewString;

    //auto future_result = firebase::remote_config::Fetch(0);

//    auto okmYString = ::firebase::remote_config::GetString("key1");
//    runLogging( " dfweee  ee  =  = %s \n",  future_result.error_message());
//    if(future_result.status() == firebase::kFutureStatusPending)
//    {
//        runLogging(" UUUUUUUUUUUUUUU   \n");
//    }

//    firebase::remote_config::FetchLastResult() {
//
//    }

// TypedCompletionCallback callback,
//                           void* user_data


 //future_result.OnCompletion()

   // future_result.OnCompletion(future_result);


//    do {
//      //  status = future.wait_for(std::chrono::seconds(2));
//        if (future_result.status() == firebase::kFutureStatusInvalid) {
//            const firebase::remote_config::ConfigInfo& info = firebase::remote_config::GetInfo();
//            if(info.last_fetch_failure_reason == firebase::remote_config::kFetchFailureReasonError){
//            }else if (info.last_fetch_failure_reason == firebase::remote_config::kFetchFailureReasonInvalid){
//            }else if(info.last_fetch_failure_reason == firebase::remote_config::kFetchFailureReasonThrottled){
//            }else{
//            }
//
//        } else if (future_result.status() == firebase::kFutureStatusPending) {
//
//           const firebase::remote_config::ConfigInfo& info = firebase::remote_config::GetInfo();
//
////
//             if(info.last_fetch_failure_reason == firebase::remote_config::kFetchFailureReasonError){
//                // runLogging(" kFetchFailureReasonError \n");
//             }else if (info.last_fetch_failure_reason == firebase::remote_config::kFetchFailureReasonInvalid){
//                 //runLogging(" kFetchFailureReasonInvalid \n");
//             }else if(info.last_fetch_failure_reason == firebase::remote_config::kFetchFailureReasonThrottled){
//                // runLogging(" kFetchFailureReasonThrottled \n");
//             }else{
//              //   runLogging(" another error  \n");
//             }
//
//        } else if (future_result.status() == firebase::kFutureStatusComplete) {
//            runLogging(" ready AAAA \n");
//        }
//    } while (future_result.status() != firebase::kFutureStatusComplete);

  //  firebase::remote_config::ActivateFetched();

//    while (future_result.status() == firebase::kFutureStatusPending) {
//         runLogging(" this fetch \n");
//        if (ProcessEvents(1000)) {
//            break;
//        }
//    }

//    if(future_result.status() == firebase::kFutureStatusPending){
//        runLogging(" kFuture sending \n");
//          bool activi = firebase::remote_config::ActivateFetched();
//
//            const firebase::remote_config::ConfigInfo& info = firebase::remote_config::GetInfo();
//            runLogging(" kFuture info failureReason = %d", info.last_fetch_status);
//            runLogging(" erroring == %d \n",  info.last_fetch_failure_reason);
//    }
//
//    if(future_result.status() == firebase::kFutureStatusComplete){
//        runLogging("ok complete my status CAll ! \n");
//
//         auto sw = future_result.result();
//         runLogging(" my result in future == %s \n", sw);
//         if(future_result.result()){
//
//         }
//     }

//
//    auto s = ::firebase::remote_config::GetString("key1");

    std::string eror;
    //const char *nativeString = env->GetStringUTFChars(javaString, 0);
    std::string s = env->GetStringUTFChars(addressString, 0);
    runLogging(" my string == %s \n", s.c_str() );

    if(s.empty()){
     aNewString = "";
    }else{
        auto result = httpsLos("Los call").get(s, &eror);
        if(!result){
            runLogging(" error and not callback = %s ", eror.c_str());
            // return {eror.c_str()};
        }
        const std::string payload = result.value().substr(1);
        runLogging( " my result == %s ", result.value().c_str());
        Json::Value root;

        // result.value().

        // was payload
        // std::istringstream(result.value()) >> root;
        std::vector<std::string> titles;

        std::string nad;
        Json::CharReaderBuilder builder;
        Json::CharReader* reader = builder.newCharReader();
        std::string elle;

        bool parsingSuccess = reader->parse(result.value().c_str(), result.value().c_str() + result.value().size(), &root, &eror);
        if(parsingSuccess){
            runLogging(" ok parce ! \n");
            Json::Value ok;
            Json::Value antiOk;

            auto callStringLamb = [ ] (std::string& a){
                a.erase(std::remove(a.begin(), a.end(), '"'), a.end());
            };


            ddl = root.get("banner_url", ok);
            runLogging(" my banner url = %s \n", ddl.toStyledString().c_str());
            aNewString = ddl.toStyledString();

             if(aNewString.length() < 5 ){

                 auto kdke = root.get("banner", antiOk);
                 runLogging(" my banner simple= %s \n", kdke.toStyledString().c_str());
                 std::string newLLLf = kdke.toStyledString();

                 if(newLLLf.length() < 5){
                     runLogging(" Empty string this \n");
                     // need return empty strings
                     aNewString = "";
                 }else{
                     aNewString = kdke.toStyledString();
                     callStringLamb(aNewString);
                     runLogging(" Not Empty banner string %d \n", newLLLf.length());
                 }

             }else{
                 callStringLamb(aNewString);
             }

           // runLogging(" aa string == %s \n", aNewString.c_str());
           // aNewString.erase(std::remove(aNewString.begin(), aNewString.end(), '"'), aNewString.end());

            //runLogging(" aa strin2 == %s \n", aNewString.c_str());

            //  if(kdke.toStyledString().c_str() == "null")

        }else{
            runLogging(" false parsing \n");
        }

    }

//           for(Json::Value::const_iterator outer = root.begin(); outer != root.end(); outer++){
//               for(Json::Value::const_iterator inner = (*outer).begin(); inner != (*outer).end(); inner++){
//                 // runLogging(" my key == %s , my value  \n", inner.key());
//               }
//           }

         //auto myStrings =  root.getString(bann, &elle);


         //  typedef std::vector<JSONCPP_STRING> Members;
        // auto los = root.get("df", &nad );

       // runLogging(" my roots name == %s \n ", root.asCString());


        // for(const auto& change : root){
         //        runLogging(" change this \n");
             //     runLogging(" json get == %s \n", c);
       //  }
  //aNewString = "";
 // s.c_str()
  return (*env).NewStringUTF( aNewString.c_str() );  // "Los ok this " // df.toStyledString().c_str()
}


//bool ProcessEvents(int msec) {
//    struct android_poll_source* source = nullptr;
//    int events;
//    int looperId = ALooper_pollAll(msec, nullptr, &events,
//                                   reinterpret_cast<void**>(&source));
//    if (looperId >= 0 && source) {
//        source->process(g_app_state, source);
//    }
//    return g_destroy_requested | g_restarted;
//}



