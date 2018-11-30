package com.example.administrator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pinglun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinglun);
        Button back = (Button)findViewById(R.id.title_button1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pinglun.this,ditu.class);
                startActivity(intent);
            }
        });

        Button tijiao = (Button)findViewById(R.id.tijiaofengxiang1);
        tijiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(pinglun.this,ditu.class);
                Toast.makeText(pinglun.this,"提交成功",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}
