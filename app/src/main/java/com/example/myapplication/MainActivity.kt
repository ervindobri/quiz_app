package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), CommunicatorInterface  {

    private val CONTENT_VIEW_ID = 10101010

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainFragment = MainFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container, mainFragment).commit()

    }

    override fun passData(s: String) {
        super.passData(s)
        //
        val bundle = Bundle()
        bundle.putString("name", s)


        val quizFragment = QuizFragment()
        quizFragment.arguments = bundle;

        supportFragmentManager.beginTransaction().replace(R.id.container, quizFragment).commit()
    }

    override fun onCreateView(parent: View?, name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(parent, name, context, attrs)



    }
}