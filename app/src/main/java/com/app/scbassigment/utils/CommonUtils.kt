package com.app.scbassigment.utils

import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.app.scbassigment.data.ViewDataClass

object CommonUtils {

    fun addFragment(
        activity: AppCompatActivity,
        fragmentContainerResourceId: Int,
        currentFragment: Fragment,
        nextFragment: Fragment,
        commitAllowingStateLoss: Boolean
    ) {

        val fragmentTransaction = activity.supportFragmentManager.beginTransaction()
        fragmentTransaction.apply {
            this.add(fragmentContainerResourceId, nextFragment, nextFragment.javaClass.simpleName)
            this.addToBackStack(nextFragment.javaClass.simpleName)

            val parentFragment = currentFragment.parentFragment
            this.hide(parentFragment ?: currentFragment)

            if (!commitAllowingStateLoss) this.commit()
            else this.commitAllowingStateLoss()
        }
    }

    fun replaceFragment(
        activity: AppCompatActivity,
        fragmentContainerResourceId: Int,
        nextFragment: Fragment?,
        commitAllowingStateLoss: Boolean
    ): Boolean {
        if (nextFragment == null) {
            return false
        }
        val fragmentTransaction = activity.supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(
            fragmentContainerResourceId,
            nextFragment,
            nextFragment.javaClass.simpleName
        )
        if (!commitAllowingStateLoss) {
            fragmentTransaction.commit()
        } else {
            fragmentTransaction.commitAllowingStateLoss()
        }
        return true
    }


    //Check regular expression
    private fun checkValidData(regExpression: Regex, value: String): Boolean {
        return value.replace(" ", "").trim().matches(regExpression)
    }

    //Return HashMap data
    fun getHashMapOfData(llParent: LinearLayout): LinkedHashMap<String, String> {
        val hashMap = LinkedHashMap<String, String>()
        val childCount = llParent.childCount
        for (i in 0 until childCount) {
            when (val view = llParent.getChildAt(i)) {
                is EditText -> {
                    hashMap[view.tag as String] =
                        view.text.toString()
                }
                is RadioGroup -> {
                    if (view.checkedRadioButtonId == -1) {
                        hashMap[view.tag as String] =
                            ""
                    } else {
                        hashMap[view.tag as String] =
                            view.checkedRadioButtonId.let { view.findViewById<RadioButton>(it) }.text.toString()
                    }

                }
            }
        }
        return hashMap
    }

    //validation of field
    fun isValid(
        hashMap: LinkedHashMap<String, String>,
        firstForm: List<ViewDataClass.FormBody>
    ): String {
        if (hashMap.keys.size > 0) {
            for (i in hashMap.keys) {
                if (hashMap[i].isNullOrEmpty()) {
                    for (element in firstForm) {
                        if ((element.id) == i && element.required.toBoolean()) {
                            return element.error
                        }
                    }
                } else {
                    for (element1 in firstForm) {
                        if ((element1.id) == i) {
                            for (element in element1.validation) {
                                if (!checkValidData(
                                        Regex(element.regExp.replace("/", "")),
                                        hashMap[i]!!
                                    )
                                ) {
                                    return element.error
                                }
                            }
                        }
                    }
                }
            }
            return ""
        } else {
            return "Please enter some data"
        }
    }
}