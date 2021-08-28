package com.example.internshipassignment.BottomSheets

import android.content.DialogInterface
import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.example.internshipassignment.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottomsheet1.*
import kotlinx.android.synthetic.main.bottomsheet1.view.*
class BottomSheet1: BottomSheetDialogFragment(), onDestroyBottomSheet2 {



    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        //this will inflate the fragmentlaqyout
        val view= LayoutInflater.from(context).inflate(R.layout.bottomsheet1,container,false)



        view.bottomsheetbtn.setOnClickListener {


            val bottomSheet2= BottomSheet2(this)

            bottomSheet2.show((activity as AppCompatActivity).supportFragmentManager,"HIII")



            //his function will set margin to bottomsheet
            setmargin()



        }




        return view
    }




    //this function will set the background of bottomsheet
    override fun getTheme(): Int {
        return R.style.AppBottomSheetDialogTheme
    }



    fun setmargin(){


        (view?.parent as View).setBackgroundColor(Color.TRANSPARENT)
        val resources = resources

        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            assert(view != null)
            val parent = view?.parent as View
            val layoutParams = parent.layoutParams as CoordinatorLayout.LayoutParams
            layoutParams.width=1000

            parent.layoutParams = layoutParams
        }
    }


    override fun onDestroySheet() {
        val resources = resources

        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            assert(view != null)
            val parent = view?.parent as View
            val layoutParams = parent.layoutParams as CoordinatorLayout.LayoutParams
            layoutParams.width= MATCH_PARENT

            parent.layoutParams = layoutParams
        }
    }


}
interface onDestroyBottomSheet2{
    fun onDestroySheet()
}