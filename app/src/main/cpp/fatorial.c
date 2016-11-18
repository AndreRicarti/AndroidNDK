//
// Created by a.ricarti on 17/11/2016.
//
#include <jni.h>
#include <stdio.h>

JNIEXPORT jint JNICALL
Java_com_example_aricarti_testec_MainActivity_stringFromJNI4(JNIEnv *env, jobject jobj, jint num){
    //num = 3;
    jint result=1;

    while(num){
        result*=num;
        num--;
    }
    return result;
}
