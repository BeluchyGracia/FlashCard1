package com.example.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)
        val textView1 = findViewById<TextView>(R.id.textView1)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val mainLayout = findViewById<RelativeLayout>(R.id.main_layout)
        flashcardAnswer.visibility = View.INVISIBLE
        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.INVISIBLE
            flashcardAnswer.visibility = View.VISIBLE
        }
        flashcardAnswer.setOnClickListener {
            flashcardAnswer.visibility = View.INVISIBLE
            flashcardQuestion.visibility = View.VISIBLE
        }

        textView1.setOnClickListener {
            textView1.setBackgroundColor(resources.getColor(R.color.red))
            textView3.setBackgroundColor(resources.getColor(R.color.green))
        }

        textView2.setOnClickListener {
            textView2.setBackgroundColor(resources.getColor(R.color.red))
            textView3.setBackgroundColor(resources.getColor(R.color.green))
        }

        textView3.setOnClickListener {
            textView3.setBackgroundColor(resources.getColor(R.color.green))
        }
        mainLayout.setOnClickListener {
            resetTextViewBackgrounds(textView1, textView2, textView3)
        }
    }

    private fun resetTextViewBackgrounds(vararg textViews: TextView) {
        for (textView in textViews) {
            textView.setBackgroundColor(resources.getColor(R.color.beige_clair))
        }
    }
}
