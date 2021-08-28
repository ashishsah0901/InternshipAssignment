package com.example.internshipassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.internshipassignment.BottomSheets.BottomSheet1
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.bottomsheet1.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // this function will set the click on the mainactivty button
        setbutton()




    }

    fun setbutton(){

        Openbtn.setOnClickListener {

            supportActionBar?.hide()

            Log.d("Buttonclick","check from here")
            val bottomSheet1= BottomSheet1()
            bottomSheet1.show(supportFragmentManager,"hi im the bottom sheet")





        }

    }

}