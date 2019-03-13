package com.developmentapps.quiz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.developmentapps.quiz.R;
import com.developmentapps.quiz.model.Answer;
import com.developmentapps.quiz.model.Question;
import com.developmentapps.quiz.service.QuestionService;
public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
