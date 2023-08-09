package cn.naizhe579.mouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.naizhe579.net.NetUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NetUtils.Instance.hi()
    }
}