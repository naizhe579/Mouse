package cn.naizhe579.net

import com.google.gson.reflect.TypeToken

interface OnNetListener<T> {

    fun getTypeToken(): TypeToken<T>

    fun decodeDataStr(dataStr: String): String {
        return dataStr
    }

    fun checkData(data: T): Boolean {
        return data != null
    }

    fun onStart() {

    }

    fun onCache(data: T)

    fun onNetStart()

    fun onNetWin(data: T)

    fun onNetFail(throwable: Throwable)

    fun onNetEnd()

    fun onEnd() {

    }

}