package com.llc.android_lcplugin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.lzh.nonview.router.anno.RouterRule
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import r.xcstasy.com.host_core.base.contract.MvpContract

@RouterRule("main")
class PluginMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            Observable.just(10)
                    .subscribeOn(Schedulers.io())
                    .subscribe {
                        t ->
                        Log.d("MainActivity", "result: " + t)
                    }
            object : MvpContract.Model{
                override fun destroy() {
                    Log.d("MainActivity", "result: aaaaaaaaaaaaaaaaaaaaaa")
                }

            }.destroy()
        }
    }
}
