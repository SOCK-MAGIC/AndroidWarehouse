package com.github.sockmagic.androidwarehouse.services

import com.intellij.openapi.project.Project
import com.github.sockmagic.androidwarehouse.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
