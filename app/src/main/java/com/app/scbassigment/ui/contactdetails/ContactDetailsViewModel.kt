package com.app.scbassigment.ui.contactdetails

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.scbassigment.data.Repository
import com.app.scbassigment.data.ViewDataClass
import com.app.scbassigment.utils.CommonUtils

class ContactDetailsViewModel : ViewModel() {

    var contactDetailsListener: ContactDetailsListener? = null
    val errorLiveData: LiveData<String> = MutableLiveData()
    var hashMap = LinkedHashMap<String, String>()

    fun onNextClick(view: View) {
        contactDetailsListener?.onNextClick()
        (errorLiveData as MutableLiveData).value =
            CommonUtils.isValid(hashMap, getDynamicView()!!)
    }

    fun getDynamicView(): List<ViewDataClass.FormBody>? {
        return Repository.getViewConfiguration()?.contact_details
    }
}