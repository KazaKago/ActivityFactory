package com.kazakago.activityfactory

@Target(AnnotationTarget.FIELD)
annotation class FactoryParam(val required: Boolean = true)