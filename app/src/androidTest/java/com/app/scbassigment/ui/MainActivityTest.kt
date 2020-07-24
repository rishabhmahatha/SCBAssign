package com.app.scbassigment.ui


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.app.scbassigment.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun mainActivityTest() {
        val editText = onView(
            allOf(
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        editText.perform(click())

        val editText2 = onView(
            allOf(
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        editText2.perform(replaceText("Firstname"), closeSoftKeyboard())

        val editText3 = onView(
            allOf(
                withText("Firstname"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        editText3.perform(pressImeActionButton())

        val editText4 = onView(
            allOf(
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        editText4.perform(replaceText("Lastname"), closeSoftKeyboard())

        val editText5 = onView(
            allOf(
                withText("Lastname"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        editText5.perform(pressImeActionButton())

        val editText6 = onView(
            allOf(
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        editText6.perform(replaceText("Fathername"), closeSoftKeyboard())

        val editText7 = onView(
            allOf(
                withText("Fathername"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        editText7.perform(pressImeActionButton())

        val editText8 = onView(
            allOf(
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        editText8.perform(replaceText("24"), closeSoftKeyboard())

        val editText9 = onView(
            allOf(
                withText("24"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        editText9.perform(pressImeActionButton())

        val radioButton = onView(
            allOf(
                withText("Male"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.llParent),
                        4
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        radioButton.perform(click())

        val appCompatButton = onView(
            allOf(
                withId(R.id.btnNext), withText("Next"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.flContainer),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatButton.perform(click())

        val editText10 = onView(
            allOf(
                childAtPosition(
                    allOf(
                        withId(R.id.llParent1),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        editText10.perform(replaceText("Company"), closeSoftKeyboard())

        val editText11 = onView(
            allOf(
                withText("Company"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent1),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        editText11.perform(pressImeActionButton())

        val editText12 = onView(
            allOf(
                childAtPosition(
                    allOf(
                        withId(R.id.llParent1),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        editText12.perform(replaceText("Mobile"), closeSoftKeyboard())

        val editText13 = onView(
            allOf(
                withText("Mobile"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent1),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        editText13.perform(pressImeActionButton())

        val appCompatButton2 = onView(
            allOf(
                withId(R.id.btnNext), withText("Next"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.flContainer),
                        1
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatButton2.perform(click())

        val editText14 = onView(
            allOf(
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        editText14.perform(replaceText("1234567"), closeSoftKeyboard())

        val appCompatButton3 = onView(
            allOf(
                withId(R.id.btnNext), withText("Submit"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.flContainer),
                        2
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatButton3.perform(click())

        val editText15 = onView(
            allOf(
                withText("1234567"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        editText15.perform(click())

        val editText16 = onView(
            allOf(
                withText("1234567"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        editText16.perform(replaceText("1234567890"))

        val editText17 = onView(
            allOf(
                withText("1234567890"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        editText17.perform(closeSoftKeyboard())

        val editText18 = onView(
            allOf(
                withText("1234567890"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        editText18.perform(pressImeActionButton())

        val editText19 = onView(
            allOf(
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        editText19.perform(pressImeActionButton())

        val editText20 = onView(
            allOf(
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        editText20.perform(replaceText("test@grr.la"), closeSoftKeyboard())

        val editText21 = onView(
            allOf(
                withText("test@grr.la"),
                childAtPosition(
                    allOf(
                        withId(R.id.llParent),
                        childAtPosition(
                            withClassName(`is`("androidx.constraintlayout.widget.ConstraintLayout")),
                            1
                        )
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        editText21.perform(pressImeActionButton())

        val appCompatButton4 = onView(
            allOf(
                withId(R.id.btnNext), withText("Submit"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.flContainer),
                        2
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatButton4.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
