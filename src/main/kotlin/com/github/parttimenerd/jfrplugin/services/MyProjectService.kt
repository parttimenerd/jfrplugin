package com.github.parttimenerd.jfrplugin.services

import com.intellij.openapi.project.Project
import com.github.parttimenerd.jfrplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
