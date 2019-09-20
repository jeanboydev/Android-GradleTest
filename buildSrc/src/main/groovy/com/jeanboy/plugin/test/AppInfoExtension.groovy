package com.jeanboy.plugin.test

/**
 * 与自定义插件进行参数传递
 */
class AppInfoExtension {
    String versionCode
    String versionName
    String versionInfo
    String fileName

    AppInfoExtension() {
    }


    @Override
    String toString() {
        return "AppInfoExtension{" +
                "versionCode='" + versionCode + '\'' +
                ", versionName='" + versionName + '\'' +
                ", versionInfo='" + versionInfo + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}