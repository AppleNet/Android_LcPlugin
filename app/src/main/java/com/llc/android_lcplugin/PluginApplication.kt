package com.llc.android_lcplugin

import android.app.Application
import com.lzh.nonview.router.RouterConfiguration
import com.lzh.nonview.router.anno.RouteConfig
import com.lzh.router.replugin.plugin.PluginRouterConfiguration



/**
 * com.llc.android_lcplugin.PluginApplication
 * @author liulongchao
 * @since 2017/8/26
 */

@RouteConfig(baseUrl = "plugin://")
class PluginApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        // TODO 如果清单文件配置了别名，这里必须要和清单文件保持一致，否则就会报找不到url
        PluginRouterConfiguration.init("com.example.llcgs.android_kotlin", "plugin", this)
        RouterConfiguration.get().addRouteCreator(RouterRuleCreator())
    }

}