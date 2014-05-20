LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := myLib
LOCAL_SRC_FILES := \
	/Users/Skorepa/prg/Android/NDKSample/app/src/main/jni/main.c \

LOCAL_C_INCLUDES += /Users/Skorepa/prg/Android/NDKSample/app/src/main/jni
LOCAL_C_INCLUDES += /Users/Skorepa/prg/Android/NDKSample/app/src/debug/jni

include $(BUILD_SHARED_LIBRARY)
