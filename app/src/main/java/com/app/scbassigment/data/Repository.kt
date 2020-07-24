package com.app.scbassigment.data

import com.google.gson.Gson

object Repository {

    fun getViewConfiguration(): ViewDataClass? {
        return Gson().fromJson(DummyData.dummyViewData, ViewDataClass::class.java)
    }

}