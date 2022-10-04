package com.mgh.pmdm.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador=0
    val TAG="ESTADOS_CONTADOR"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "En el método onCreate")
        setContentView(R.layout.activity_main)

        // Referencia al TextView
        val textViewContador=findViewById<TextView>(R.id.textViewContador)

        // Inicializamos el TextView con el contador a 0
        textViewContador.setText(contador.toString())

        // Referencia al botón
        val btAdd=findViewById<Button>(R.id.btAdd)

        // Asociaciamos una expresióin lambda como
        // respuesta (callback) al evento Clic sobre
        // el botón
        btAdd.setOnClickListener {
            contador++
            textViewContador.setText(contador.toString())
        }

    }
    override fun OnStart(){
        super.onStart()
        Log.d(TAG, "En el método onStart")
    }


    override fun onResume(){
        super.onResume()
        Log.d(TAG, "En el método onResume")
    }

    override fun onPause(){
        super.onResume()
        Log.d(TAG, "En el método onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d(TAG, "En el método onStop")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d(TAG, "En el método onRestart")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, "En el método onDestroy")
    }

    override fun onSaveInstanceState(estadoAGuardar: Bundle) {
        super.onSaveInstanceState(estadoAGuardar)
        Log.d(TAG, "onSaveInstanceState. Guardo contador" +contador.toString())
        estadoAGuardar.putInt("Contador", contador)
    }

    override fun onRestoreInstanceState(estadoARestaurar: Bundle) {
        super.onRestoreInstanceState(estadoARestaurar)
        contador=estadoARestaurar.getInt("Contador")
        Log.d(TAG, "onRestoreInstanceSatate. Restauro al contador el valor " +contador.toString())

        val textViewContador:TextView=findViewById(R.id.textViewContador)
        textViewContador.setText(contador.toString())
    }


}