package itsco.edu.miproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun mundohola (view: View) {
        Toast.makeText(this,"HOLA MUNDO", Toast.LENGTH_SHORT).show()
    }
}
