package com.example.internshipassignment.BottomSheets

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.internshipassignment.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottomsheet1.*
import kotlinx.android.synthetic.main.bottomsheet2_additional.*
import kotlinx.android.synthetic.main.bottomsheet2_additional.view.*






class BottomSheet2(private val listener: onDestroyBottomSheet2):BottomSheetDialogFragment() {





    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //this will inflate the fragmentlaqyout

        val view= LayoutInflater.from(context).inflate(R.layout.bottomsheet2_additional,container,false)


        return view
    }





    //this function will set the background of bottomsheet
    override fun getTheme(): Int {
        return R.style.AppBottomSheetDialogTheme
    }


    override fun onDestroy() {
        super.onDestroy()
        listener.onDestroySheet()
    }



}