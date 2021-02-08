package aus.kt.alog

import android.util.Log

class ALog() {
    companion object {

        private lateinit var link : String

        private fun getPName(): String {
            val t = Throwable().stackTrace
            var i = 0
            for (index in t.indices) {
                if (t[index].className != javaClass.name) {
                    i = index
                    break
                }
            }
            return "${t[i].className} ::: ${t[i].methodName} ::: [line : ${t[i].lineNumber}] ::: (${t[i].fileName}:${t[i].lineNumber})"
        }

        // log.d
        fun d(msg: Any = "") {
            if (CheckDebug.DEBUG)
                Log.d("LOG", "${getPName()} ::: $msg")
        }

        // log.v
        fun v(msg: String = "") {
            if (CheckDebug.DEBUG)
                Log.v("LOG", "${getPName()} ::: $msg")
        }

        // log.i
        fun i(msg: String = "") {
            if (CheckDebug.DEBUG)
                Log.i("LOG", "${getPName()} ::: $msg")
        }

        // log.e
        fun e(msg: Any? = "") {
            if (CheckDebug.DEBUG)
                Log.e("LOG", "${getPName()} ::: $msg")
        }

        // log.w
        fun w(msg: String = "") {
            if (CheckDebug.DEBUG)
                Log.w("LOG", "${getPName()} ::: $msg")
        }

    }


}