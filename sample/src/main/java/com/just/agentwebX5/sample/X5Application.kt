package com.just.agentwebX5.sample

import android.app.Application
import com.tencent.smtt.sdk.QbSdk

import com.tencent.smtt.export.external.TbsCoreSettings
import java.util.*


/**
 * author : walkthehorizon
 * email : 1308311472@qq.com
 */
class X5Application : Application() {

    override fun onCreate() {
        super.onCreate()

        // 在调用TBS初始化、创建WebView之前进行如下配置
        val map = HashMap<String,Any>()
        map.put(TbsCoreSettings.TBS_SETTINGS_USE_SPEEDY_CLASSLOADER, true)
        map.put(TbsCoreSettings.TBS_SETTINGS_USE_DEXLOADER_SERVICE, true)
        QbSdk.initTbsSettings(map)

    }

}