//
// Created by loskutnikov on 22.06.2020.
//

#pragma once

#include <optional>
#include <string>


class httpsLos {

public:
      explicit httpsLos(const std::string& canPath);
      httpsLos(const httpsLos&) = delete;
      ~httpsLos();

     void operator=(const httpsLos&) = delete;


     std::optional<std::string> get(const std::string& url, std::string* error) const;

private:
       const std::string canPatj;
};


