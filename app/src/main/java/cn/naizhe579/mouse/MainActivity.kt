package cn.naizhe579.mouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.naizhe579.net.NetUtils
import cn.naizhe579.net.OnNetListener
import cn.naizhe579.net.base.NetCacheType
import cn.naizhe579.net.base.OnlyCache
import com.google.gson.reflect.TypeToken
import java.lang.Exception
import java.lang.reflect.Type

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NetUtils.Instance.hi()

        ///测试提交

        var type: NetCacheType = OnlyCache

        var listener: OnNetListener<String>

        listener = object : OnNetListener<String> {

            override fun getTypeToken(): TypeToken<String> {
                return object : TypeToken<String>() {
                }
            }

            override fun onCache(data: String) {

            }

            override fun onNetStart() {

            }

            override fun onNetFail(throwable: Throwable) {

            }

            override fun onNetEnd() {

            }

            override fun onNetWin(data: String) {

            }

        }

        var t1: Type = listener.getTypeToken().type
        var t2: Class<String> = "".javaClass
        var b: Boolean = t1 == t2
        println("ssssss  ---  $b  -$t1 -$t2")

    }
}