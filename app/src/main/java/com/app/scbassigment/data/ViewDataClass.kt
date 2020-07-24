package com.app.scbassigment.data

data class ViewDataClass(
    val contact_details: List<FormBody>,
    val personal_details: List<FormBody>,
    val professional_details: List<FormBody>
) {
    data class FormBody(
        val error: String,
        val hint: String,
        val id: String,
        val input_type: String,
        val item: List<Item>,
        val max_line: String,
        val `property`: Property,
        val required: String,
        val validation: List<Validation>,
        val view_type: String
    ) {
        data class Property(
            val max_length: String,
            val min_length: String
        )

        data class Validation(
            val error: String,
            val regExp: String
        )

        data class Item(
            val name: String,
            val selected: String
        )
    }
}