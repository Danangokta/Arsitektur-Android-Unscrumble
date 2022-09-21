package id.oktdan.android.unscramble

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.unscramble.R

// Membuat Aktivitas yang menlakukan proses fragmen game pada aplikasi nantinya

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}