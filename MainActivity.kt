package com.example.assignment1

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Tag for logging
    companion object {
        private const val TAG = "MainActivity"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components
        val inputTime = findViewById<EditText>(R.id.inputTime)
        val sparkBtn = findViewById<Button>(R.id.sparkBtn)
        val suggestionTextview = findViewById<TextView>(R.id.suggestionTextview)
        val resetBtn = findViewById<Button>(R.id.resetBtn)

        // Set click listener for "Get Spark" button
        sparkBtn.setOnClickListener {
            // Get user input and trim whitespace
            val timeInput = inputTime.text.toString().trim()
            Log.d(TAG, "User entered: '$timeInput'")

            // Call function to get suggestion based on input
            val suggestion = getSuggestionForTime(timeInput)
            suggestionTextview.text = suggestion

            // Log the outcome
            if (suggestion.startsWith("Invalid")) {
                Log.w(TAG, "Invalid input: $timeInput")
            } else {
                Log.i(TAG, "Suggestion displayed for: $timeInput")
            }
        }

        // Reset button clears input field and suggestion text
        resetBtn.setOnClickListener {
            inputTime.text.clear()
            suggestionTextview.text = ""
            Log.d(TAG, "Reset button clicked – input and suggestion cleared")
        }
    }

    /**
     * Returns a social spark suggestion based on the time of day.
     * Uses if-else statements to match the input string (case-insensitive).
     *
     * @param timeInput The user-entered time description
     * @return A suggestion string or an error message
     */
    private fun getSuggestionForTime(timeInput: String): String {
        // Convert input to lowercase for case-insensitive matching
        val lowerInput = timeInput.lowercase()

        // Use if-else if chain to check all possible times
        when (lowerInput) {
            "morning" -> {
                return "Send a 'Good morning' text to a family member."
            }
            "mid-morning" -> {
                return "Reach out to a colleague with a quick 'Thank you.'"
            }
            "afternoon" -> {
                return "Share a funny meme or interesting link with a friend."
            }
            "afternoon snack time" -> {
                return "Send a quick 'thinking of you' message."
            }
            "dinner" -> {
                return "Call a friend or relative for a 5-minute catch-up."
            }
            "after dinner", "night" -> {
                return "Leave a thoughtful comment on a friend's post."
            }
            else -> {
                // Error handling: provide constructive feedback
                return "Invalid input\"$timeInput\". Please try: Morning, Mid-morning, Afternoon, Afternoon Snack Time, Dinner, After Dinner, or Night."
            }
        }
    }
}