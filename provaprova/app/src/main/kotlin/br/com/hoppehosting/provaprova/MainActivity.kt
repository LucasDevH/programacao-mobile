package br.com.hoppehosting.provaprova

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val tag = "Prova"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(tag, "onCreate chamado")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy chamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "onRestart chamado")
    }
}
