package com.example.lifecycleapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import br.com.hoppehosting.prova.R

class MainActivity : AppCompatActivity() {

    private val TAG = "CicloDeVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate() - [CRE] Inicialização da Activity")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() - [STA] A Activity está visível")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() - [RES] A Activity está no primeiro plano")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() - [PAU] A Activity está perdendo o foco")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() - [STO] A Activity não está mais visível")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart() - [RES] A Activity está sendo reiniciada")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() - [DES] A Activity está sendo destruída")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState() - [SIS] Salvando estado da Activity")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState() - [RIS] Restaurando estado da Activity")
    }
}
