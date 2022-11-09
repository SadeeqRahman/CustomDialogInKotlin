package com.encoders.customdialoginkotlin

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val show_dialog = findViewById<Button>(R.id.button)
        show_dialog.setOnClickListener {
            Filtration_Dialog()
        }
    }

    private fun Filtration_Dialog() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.filter_bottomsheet_fragment)

        val popular = dialog.findViewById(R.id.popular) as TextView
        val nearest = dialog.findViewById(R.id.nearest) as TextView
        val rating = dialog.findViewById(R.id.rating) as TextView
        val chepeast = dialog.findViewById(R.id.chepeast) as TextView

        popular.setOnClickListener {

            dialog.dismiss()
        }
        nearest.setOnClickListener {

            dialog.dismiss()
        }
        rating.setOnClickListener {

            dialog.dismiss()
        }

        chepeast.setOnClickListener {

            dialog.dismiss()
        }

        dialog.show()
        dialog.window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window!!.attributes.windowAnimations = R.style.DialogAnimation
        dialog.window!!.setGravity(Gravity.BOTTOM)

    }


}