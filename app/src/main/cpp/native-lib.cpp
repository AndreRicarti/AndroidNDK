#include <jni.h>
#include <string>

extern "C"
jstring
Java_com_example_aricarti_testec_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "André Felipe Ricarti";
    return env->NewStringUTF(hello.c_str());
}
