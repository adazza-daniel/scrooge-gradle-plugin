package com.adazza.gradle.scrooge

import org.gradle.api.Plugin
import org.gradle.api.Project

class ScroogePlugin implements Plugin<Project> {

    @Override
    void apply(final Project project) {
        project.tasks.create("compileScrooge", ScroogeCompileTask)
    }
}
