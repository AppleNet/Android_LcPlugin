package com.llc.android_lcplugin


import android.content.Context
import android.os.Bundle
import android.widget.Toast

import com.lzh.nonview.router.anno.RouterRule
import com.lzh.nonview.router.route.ActionSupport

@RouterRule("action")
class PluginActionA : ActionSupport() {

    override fun onRouteTrigger(context: Context, bundle: Bundle) {
        Toast.makeText(context, "Plugin Action A invoked!", Toast.LENGTH_SHORT).show()
    }
}
