package com.app.scbassigment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.scbassigment.R
import com.app.scbassigment.ui.personaldetails.PersonalDetailsFragment
import com.app.scbassigment.utils.CommonUtils

class MainActivity : AppCompatActivity() {

    val hmUserDetails = LinkedHashMap<String, String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CommonUtils.replaceFragment(
            this, R.id.flContainer,
            PersonalDetailsFragment(), false
        )
    }
}