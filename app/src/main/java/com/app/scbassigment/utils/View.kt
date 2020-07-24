package com.app.scbassigment.utils

import android.content.Context
import android.text.InputFilter
import android.text.InputFilter.LengthFilter
import android.text.InputType
import android.view.View
import android.widget.*
import com.app.scbassigment.R
import com.app.scbassigment.data.ViewDataClass


fun Context.getCustomView(viewBody: ViewDataClass.FormBody): View {
    when (viewBody.view_type) {
        VIEW_EDIT_TEXT -> {
            val editText = EditText(this)
            editText.apply {
                hint = viewBody.hint
                maxLines = viewBody.max_line.toInt()
                inputType = InputType.TYPE_CLASS_TEXT
                filters = arrayOf<InputFilter>(LengthFilter(viewBody.property.max_length.toInt()))
                tag = viewBody.id
            }
            return editText
        }

        VIEW_EDIT_TEXT_NUMBER -> {
            val editText = EditText(this)
            editText.apply {
                hint = viewBody.hint
                maxLines = viewBody.max_line.toInt()
                inputType = InputType.TYPE_CLASS_NUMBER
                filters = arrayOf<InputFilter>(LengthFilter(viewBody.property.max_length.toInt()))
                tag = viewBody.id
            }
            return editText
        }

        VIEW_RADIO_BUTTON -> {
            val radioGroup = RadioGroup(this)
            radioGroup.tag = viewBody.id
            val textView = TextView(this)
            textView.text = viewBody.id
            radioGroup.addView(textView)
            for (i in viewBody.item.indices) {
                val radioButton = RadioButton(this)
                radioButton.text = viewBody.item[i].name
                radioGroup.addView(radioButton)
                radioButton.tag = viewBody.item[i].name
            }
            return radioGroup
        }

        VIEW_DROP_DOWN -> {
            val array = ArrayList<String>()
            for (j in viewBody.item.indices) {
                val optionString: String =
                    viewBody.item[j].name
                array.add(optionString)
            }
            val spinnerArrayAdapter: ArrayAdapter<String> =
                ArrayAdapter<String>(this, R.layout.spiner_row, array)
            return Spinner(this).apply {
                adapter = spinnerArrayAdapter
                setSelection(0, false)
                tag = viewBody.id
                prompt = viewBody.id
            }

        }

        else -> {
            return EditText(this).apply {
                hint = "Enter Data"
                tag = viewBody.id
            }
        }
    }
}