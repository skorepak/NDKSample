#include "com_skorepak_ndksample_app_MainActivity.h"

JNIEXPORT jint JNICALL Java_com_skorepak_ndksample_app_MainActivity_getStringFromNative(JNIEnv *env, jobject obj) {
        int i, j, k, x = 0;
        int value = 100000;
        for (i = 0; i < value; i++) {
            for (j = 0; j < value; j++) {
                if (i > j*j) {
                    x++;
                }
            }
        }
    return x;
}

