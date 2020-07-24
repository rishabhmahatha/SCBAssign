package com.app.scbassigment.data

object DummyData {
    val dummyViewData = "{\n" +
            "  \"personal_details\": [\n" +
            "    {\n" +
            "      \"id\": \"first_name\",\n" +
            "      \"view_type\": \"edit_text\",\n" +
            "      \"input_type\": \"Text\",\n" +
            "      \"max_line\": \"1\",\n" +
            "      \"hint\": \"First Name\",\n" +
            "      \"required\": \"true\",\n" +
            "      \"property\": {\n" +
            "        \"min_length\": \"5\",\n" +
            "        \"max_length\": \"30\"\n" +
            "      },\n" +
            "      \"validation\": [\n" +
            "        {\n" +
            "          \"regExp\": \"/^[a-zA-Z]{5,30}\$/\",\n" +
            "          \"error\": \"Please enter valid first name, the length must be between 5 to 30 with only alphabet char.\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"item\": [],\n" +
            "      \"error\": \"Please enter first name.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"last_name\",\n" +
            "      \"view_type\": \"edit_text\",\n" +
            "      \"input_type\": \"Text\",\n" +
            "      \"max_line\": \"1\",\n" +
            "      \"hint\": \"Last Name\",\n" +
            "      \"required\": \"true\",\n" +
            "      \"property\": {\n" +
            "        \"min_length\": \"5\",\n" +
            "        \"max_length\": \"30\"\n" +
            "      },\n" +
            "      \"validation\": [\n" +
            "        {\n" +
            "          \"regExp\": \"/^[a-zA-Z]{5,30}\$/\",\n" +
            "          \"error\": \"Please enter valid last name, the length must be between 5 to 30 with only alphabet char.\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"item\": [],\n" +
            "      \"error\": \"Please enter last name.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"father_name\",\n" +
            "      \"view_type\": \"edit_text\",\n" +
            "      \"input_type\": \"Text\",\n" +
            "      \"max_line\": \"1\",\n" +
            "      \"hint\": \"Father Name\",\n" +
            "      \"required\": \"true\",\n" +
            "      \"property\": {\n" +
            "        \"min_length\": \"5\",\n" +
            "        \"max_length\": \"30\"\n" +
            "      },\n" +
            "      \"validation\": [\n" +
            "        {\n" +
            "          \"regExp\": \"/^[a-zA-Z]{5,30}\$/\",\n" +
            "          \"error\": \"Please enter valid father name, the length must be between 5 to 30 with only alphabet char.\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"item\": [],\n" +
            "      \"error\": \"Please enter father name.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"age\",\n" +
            "      \"view_type\": \"edit_text_number\",\n" +
            "      \"input_type\": \"number\",\n" +
            "      \"max_line\": \"1\",\n" +
            "      \"hint\": \"Age\",\n" +
            "      \"required\": \"true\",\n" +
            "      \"property\": {\n" +
            "        \"min_length\": \"1\",\n" +
            "        \"max_length\": \"3\"\n" +
            "      },\n" +
            "      \"validation\": [],\n" +
            "      \"item\": [],\n" +
            "      \"error\": \"Please enter age.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"gender\",\n" +
            "      \"view_type\": \"radio_button\",\n" +
            "      \"input_type\": \"Radio\",\n" +
            "      \"max_line\": \"\",\n" +
            "      \"hint\": \"Gender\",\n" +
            "      \"required\": \"true\",\n" +
            "      \"property\": {},\n" +
            "      \"item\": [\n" +
            "        {\n" +
            "          \"name\": \"Male\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"Female\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"Others\",\n" +
            "          \"selected\": \"false\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"validation\": [],\n" +
            "      \"error\": \"Please select gender.\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"professional_details\": [\n" +
            "    {\n" +
            "      \"id\": \"current_company\",\n" +
            "      \"view_type\": \"edit_text\",\n" +
            "      \"input_type\": \"Text\",\n" +
            "      \"max_line\": \"1\",\n" +
            "      \"hint\": \"Current Company\",\n" +
            "      \"required\": \"true\",\n" +
            "      \"property\": {\n" +
            "        \"min_length\": \"5\",\n" +
            "        \"max_length\": \"30\"\n" +
            "      },\n" +
            "      \"item\": [],\n" +
            "      \"validation\": [],\n" +
            "      \"error\": \"Please enter current company name.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"technology\",\n" +
            "      \"view_type\": \"edit_text\",\n" +
            "      \"input_type\": \"Text\",\n" +
            "      \"max_line\": \"1\",\n" +
            "      \"hint\": \"Technology\",\n" +
            "      \"required\": \"true\",\n" +
            "      \"property\": {\n" +
            "        \"min_length\": \"5\",\n" +
            "        \"max_length\": \"30\"\n" +
            "      },\n" +
            "      \"item\": [],\n" +
            "      \"validation\": [],\n" +
            "      \"error\": \"Please enter technology.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"total_experience\",\n" +
            "      \"view_type\": \"drop_down\",\n" +
            "      \"input_type\": \"drop_down\",\n" +
            "      \"max_line\": \"\",\n" +
            "      \"hint\": \"Total Experience\",\n" +
            "      \"required\": \"true\",\n" +
            "      \"property\": {},\n" +
            "      \"item\": [\n" +
            "        {\n" +
            "          \"name\": \"1\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"2\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"3\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"4\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"5\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"6\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"7\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"8\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"9\",\n" +
            "          \"selected\": \"false\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"name\": \"10\",\n" +
            "          \"selected\": \"false\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"validation\": [],\n" +
            "      \"error\": \"Please select year of experience.\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"contact_details\": [\n" +
            "    {\n" +
            "      \"id\": \"mobile\",\n" +
            "      \"view_type\": \"edit_text_number\",\n" +
            "      \"input_type\": \"Number\",\n" +
            "      \"max_line\": \"1\",\n" +
            "      \"hint\": \"Mobile Number\",\n" +
            "      \"required\": \"true\",\n" +
            "      \"property\": {\n" +
            "        \"min_length\": \"10\",\n" +
            "        \"max_length\": \"10\"\n" +
            "      },\n" +
            "      \"item\": [],\n" +
            "      \"validation\": [\n" +
            "        {\n" +
            "          \"regExp\": \"/^[0-9]{10}\$/\",\n" +
            "          \"error\": \"Please enter valid mobile number, the length must be between 10.\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"error\": \"Please enter mobile number.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"alternate_mobile\",\n" +
            "      \"view_type\": \"edit_text_number\",\n" +
            "      \"input_type\": \"Number\",\n" +
            "      \"max_line\": \"1\",\n" +
            "      \"hint\": \"Alternate Mobile Number\",\n" +
            "      \"required\": \"false\",\n" +
            "      \"property\": {\n" +
            "        \"min_length\": \"10\",\n" +
            "        \"max_length\": \"10\"\n" +
            "      },\n" +
            "      \"validation\": [\n" +
            "        {\n" +
            "          \"regExp\": \"/^[0-9]{10}\$/\",\n" +
            "          \"error\": \"Please enter valid alternate number, the length must be between 10.\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"item\": [],\n" +
            "      \"error\": \"Please enter altername mobile number.\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"email\",\n" +
            "      \"view_type\": \"edit_text\",\n" +
            "      \"input_type\": \"Text\",\n" +
            "      \"max_line\": \"1\",\n" +
            "      \"hint\": \"Email\",\n" +
            "      \"required\": \"true\",\n" +
            "      \"property\": {\n" +
            "        \"min_length\": \"0\",\n" +
            "        \"max_length\": \"300\"\n" +
            "      },\n" +
            "      \"item\": [],\n" +
            "      \"validation\": [\n" +
            "        {\n" +
            "          \"regExp\": \"^[a-zA-Z0-9.!#\$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*\$\",\n" +
            "          \"error\": \"Please enter valid email address.\"\n" +
            "        }\n" +
            "      ],\n" +
            "      \"error\": \"Please enter email.\"\n" +
            "    }\n" +
            "  ]\n" +
            "}"
}