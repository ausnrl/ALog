package aus.kt.alog

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import kotlin.properties.Delegates

class CheckDebug(val context : Context) {
    companion object{
        var DEBUG by Delegates.notNull<Boolean>()

        // 현재 디버그모드여부를 리턴
        fun isDebuggable(context: Context): Boolean {
            var debuggable = false
            val pm = context.packageManager
            try {
                val appinfo = pm.getApplicationInfo(context.packageName, 0)
                debuggable = 0 != appinfo.flags and ApplicationInfo.FLAG_DEBUGGABLE
            } catch (e: PackageManager.NameNotFoundException) {
                /* debuggable variable will remain false */
            }
            return debuggable
        }
    }


}