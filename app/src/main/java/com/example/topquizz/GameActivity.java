package com.example.topquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView mQuestionText;
    private Button mAnswerButton1;
    private Button mAnswerButton2;
    private Button mAnswerButton3;
    private Button mAnswerButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        mAnswerButton1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswerButton2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswerButton3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswerButton4 = (Button) findViewById(R.id.activity_game_answer4_btn);
        mAnswerButton1.setEnabled(false);
        mAnswerButton2.setEnabled(false);
        mAnswerButton3.setEnabled(false);
        mAnswerButton4.setEnabled(false);

        mAnswerButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
            }
        });

        mAnswerButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
            }
        });

        mAnswerButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
            }
        });

        mAnswerButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
            }
        });

    }


}