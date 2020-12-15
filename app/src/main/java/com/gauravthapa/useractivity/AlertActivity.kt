package com.gauravthapa.useractivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val builder = AlertDialog.Builder( this )

            builder.setTitle("my alert")
            builder.setMessage("are you sure?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton( "yes") {_,_  ->
                Toast.makeText(applicationContext, "clicked yes", Toast.LENGTH_SHORT).show()

            }
            builder.setNeutralButton("cancel"){_,_ ->
                Toast.makeText(applicationContext, "clicked cancel\n operation cancel",
                    Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("No"){_,_ ->
                Toast.makeText(applicationContext, "no", Toast.LENGTH_SHORT).show()
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}