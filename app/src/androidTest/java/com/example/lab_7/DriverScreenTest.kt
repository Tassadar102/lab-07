package com.example.lab_7

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DriverScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>() // access MainActivity

    @Test
    fun navigate_to_drivers_add_driver_and_return_home() {
        composeTestRule
            .onNodeWithTag("driverButton")
            .performClick()

        composeTestRule
            .onNodeWithText("Complete Driver Collection")
            .assertExists()


        composeTestRule
            .onNodeWithTag("driverInput")
            .performTextInput("David Schumacher")
        composeTestRule
            .onNodeWithTag("addDriverButton")
            .performClick()
        composeTestRule
            .onNodeWithText("David Schumacher")
            .assertExists()

        composeTestRule
            .onNodeWithTag("clearDriversButton")
            .assertExists()

        composeTestRule
            .onNodeWithTag("driverInput")
            .performTextInput("Michael Schumacher")
        composeTestRule
            .onNodeWithTag("addDriverButton")
            .performClick()
        composeTestRule
            .onNodeWithText("Michael Schumacher")
            .assertExists()

        composeTestRule
            .onNodeWithTag("clearDriversButton")
            .performClick()

        composeTestRule
            .onNodeWithTag("backButton")
            .performClick()
        composeTestRule
            .onNodeWithText("FormulaZero Home")
            .assertExists()
    }
}