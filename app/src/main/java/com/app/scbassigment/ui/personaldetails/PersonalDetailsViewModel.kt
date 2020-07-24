package com.app.scbassigment.ui.personaldetails

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.scbassigment.data.Repository
import com.app.scbassigment.data.ViewDataClass
import com.app.scbassigment.utils.CommonUtils

class PersonalDetailsViewModel : ViewModel() {

    var firstFormListener: PersonalDetailsListener? = null
    val errorLiveData: LiveData<String> = MutableLiveData()

    var hashMap = LinkedHashMap<String, String>()

    fun onNextClick(view: View) {
        firstFormListener?.onNextClick()
        (errorLiveData as MutableLiveData).value =
            CommonUtils.isValid(hashMap, getDynamicView()!!)
    }

    fun getDynamicView(): List<ViewDataClass.FormBody>? {
        return Repository.getViewConfiguration()?.personal_details
    }
}