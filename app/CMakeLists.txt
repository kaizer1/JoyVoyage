# load native  explore functions
cmake_minimum_required(VERSION 3.6.0)

project(loadNativeL VERSION 1.0.0 LANGUAGES CXX) # TODO ****


add_library(loadNativeL SHARED
       src/main/cpp/loadMainConfig.cpp
        src/main/cpp/httpsLos.cpp
)

#add_library(firebase_app STATIC IMPORTED)
#add_library(firebase_remote STATIC IMPORTED)

find_library( log-lib  log)

find_package(curl REQUIRED CONFIG)
find_package(jsoncpp REQUIRED CONFIG)

add_subdirectory(${FIREBASE_CPP_SDK_DIR} bin/ EXCLUDE_FROM_ALL)
set(fire_sdk_o Q:\\AndroidProject\\firebase_cpp_sdk_6.15.0\\firebase_cpp_sdk)
#set(fire_sdk ../../firebase_cpp_sdk_6.15.0/firebase_cpp_sdk/libs/{ANDROID_ABI}/c++)
#set_target_properties(firebase_app PROPERTIES IMPORTED_LOCATION ${fire_sdk_o}/libfirebase_app.a)
#set_target_properties(firebase_remote PROPERTIES IMPORTED_LOCATION ${fire_sdk_o}/libfirebase_remote_config.a)

set(firebase_libs firebase_remote_config firebase_app)

set_target_properties(loadNativeL PROPERTIES CXX_STANDART 17)


target_include_directories(loadNativeL PRIVATE
    #    ../../firebase_cpp_sdk_6.15.0/firebase_cpp_sdk/include
    #    ${fire_sdk_o}/include
        src/main/cpp/
        ${FIREBASE_CPP_SDK_DIR}/include
             )

target_link_libraries(loadNativeL
        android
        ${log-lib}
        curl::curl
        jsoncpp::jsoncpp
        ${firebase_libs}
       # ${firebase_app}
       # ${firebase_remote}

        )

