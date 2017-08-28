package com.llc.android_lcplugin

import android.app.Application
import com.lzh.nonview.router.RouterConfiguration
import com.lzh.router.replugin.plugin.PluginRouterConfiguration



/**
 * com.llc.android_lcplugin.LcPluginApplication
 * @author liulongchao
 * @since 2017/8/26
 */

class LcPluginApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // TODO 如果清单文件配置了别名，这里必须要和清单文件保持一致，否则就会报找不到url
        PluginRouterConfiguration.init("com.example.llcgs.android_kotlin", "plugin", this)
        RouterConfiguration.get().addRouteCreator(RouterRuleCreator())
    }

}