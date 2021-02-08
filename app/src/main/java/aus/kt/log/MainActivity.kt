package aus.kt.log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import aus.kt.alog.ALog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ALog.d("LOGLOG")
    }
}