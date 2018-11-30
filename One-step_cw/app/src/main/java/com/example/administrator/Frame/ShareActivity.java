package com.example.administrator.Frame;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.administrator.R;
import com.example.administrator.ditu;
import com.example.administrator.model.DotStrategy;


import com.example.administrator.model.DotStrategy;
import com.example.administrator.model.Strategy;

import java.util.Date;

public class ShareActivity extends AppCompatActivity implements View.OnClickListener{


    public static String TAG = "ShareActivity";
    private DotStrategy strategy;
    private String comment;
    private String place_name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share);
        strategy = new DotStrategy();



    }

    @Override
    public void onClick(View v) {
        Date date = new Date();

        EditText related_place = findViewById(R.id.input_edittext);
        EditText comment = findViewById(R.id.dot_comment);
        strategy.setComment(comment.toString());
        strategy.setPlace_name(related_place.toString());
        strategy.setPublish_time(date);

        Intent intent = new Intent(ShareActivity.this,ditu.class);
        intent.putExtra("strategy_data", strategy);
        setResult(RESULT_OK,intent);
        finish();

    }
}
