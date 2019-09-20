package com.jeanboy.plugin.test

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 自定义插件
 */
class MyPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "hello plugin" + project.name

        //创建扩展属性
        project.extensions.create("myAppInfo", AppInfoExtension)
        //创建Task
        project.tasks.create("myAppInfoTask", AppInfoTask)
    }
}