package com.llc.android_lcplugin

import com.lzh.nonview.router.executors.MainThreadExecutor
import com.lzh.nonview.router.module.ActionRouteRule
import com.lzh.nonview.router.module.ActivityRouteRule
import com.lzh.nonview.router.module.RouteCreator
import java.util.*

class RouterRuleCreator : RouteCreator {
    override fun createActivityRouteRules(): Map<String, ActivityRouteRule> {
        val routes = HashMap<String, ActivityRouteRule>()
        routes.put("plugin://main", ActivityRouteRule(PluginMainActivity::class.java))
        return routes
    }

    override fun createActionRouteRules(): Map<String, ActionRouteRule> {
        val routes = HashMap<String, ActionRouteRule>()
        routes.put("plugin://action", ActionRouteRule(PluginActionA::class.java).setExecutorClass(MainThreadExecutor::class.java))
        return routes
    }
}
