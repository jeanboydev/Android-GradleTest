package com.jeanboy.plugin.test

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class AppInfoTask extends DefaultTask {

    AppInfoTask() {
        group = "jeanboy"
        description = "更新 ReleaseInfo"
    }

    /**
     * doFirst
     * taskAction
     * doLast
     */
    @TaskAction
    void doAction() {
        updateInfo()
    }

    private void updateInfo() {
        //获取到将要写入的信息
        String versionCode = project.extensions.myAppInfo.versionCode
        String versionName = project.extensions.myAppInfo.versionName
        String versionInfo = project.extensions.myAppInfo.versionInfo
        String fileName = project.extensions.myAppInfo.fileName

        println "versionCode:${versionCode}"
        println "versionName:${versionName}"
        println "versionInfo:${versionInfo}"
        println "fileName:${fileName}"
    }
}