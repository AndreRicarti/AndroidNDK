//
// Created by a.ricarti on 17/11/2016.
//
#include <jni.h>
#include <stdio.h>

JNIEXPORT jint JNICALL
Java_com_example_aricarti_testec_MainActivity_valueSub(JNIEnv *env, jobject jobj, jint num, jint num2){
    int sub;

    sub = num - num2;

    return sub;
}

