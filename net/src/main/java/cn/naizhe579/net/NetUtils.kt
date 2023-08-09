package cn.naizhe579.net

import android.util.Log

enum class NetUtils {
    Instance;

    private val tag = "NetUtils"

    /**
     * 初始化
     */
    init {
        Log.d(tag, "init: 初始化 !")
    }

    /**
     * hi 方法
     */
    fun hi() {
        Log.d(tag, "hi: Hi NetUtils !")
    }

}