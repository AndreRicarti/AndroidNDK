//
// Created by a.ricarti on 17/11/2016.
//
#include <jni.h>
#include <string>
#include <iostream>
#include <sstream>

extern "C"
int
Java_com_example_aricarti_testec_MainActivity_stringFromJNI3(
        JNIEnv *env,
        jobject /* this */) {

    int a, b, mult;

    a = 30;
    b = 2;

    mult = a * b;

    std::stringstream Resultado;
    Resultado << mult;

    return mult;
}


