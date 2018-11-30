package com.example.administrator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class jutipinglun extends AppCompatActivity {
    private List<pinglunzhe>pinglunzheList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jutipinglun);
        initpinglunzhe();
        pinglunzheAdapter adapter=new pinglunzheAdapter(jutipinglun.this,R.layout.pinglun_item,pinglunzheList);
        ListView listView=(ListView)findViewById(R.id.guestlist);
        listView.setAdapter(adapter);
    }
    private void initpinglunzhe(){
        pinglunzhe guest1=new pinglunzhe("小明","这地方真不错",R.drawable.touxiang1);
        pinglunzheList.add(guest1);
        pinglunzhe guest2=new pinglunzhe("小王","我觉得不行",R.drawable.touxiang2);
        pinglunzheList.add(guest2);
    }
}
