package com.example.administrator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;
import com.example.administrator.tools.MD5Util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button back = (Button)findViewById(R.id.title_button1);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button login = (Button)findViewById(R.id.sign_in);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(LoginActivity.this,homePage.class);
                startActivity(intent);
            }
        });
        /*login.setOnClickListener();
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void  onClick(View view)
            {
                sendMessage();
            }
        });*/
    }
    private void sendMessage()
    {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        OkHttpClient client = new OkHttpClient();
                        String p = "{\"user_name\":\"test\",\"user_pwd\":\"test\"}";
                        MediaType JSON = MediaType.parse("text/html; charset=utf-8");
                        RequestBody body = RequestBody.create(JSON, p);
                        Request request = new Request.Builder().url("http://115.159.198.216/YibuTest/Login").post(body).build();
                        Response response = client.newCall(request).execute();
                        String responseData = response.body().string();
                        Log.d("LoginActivity",responseData);
                        //parseJSONWithJSONObject(responseData);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }) .start();


    }
    private void parseJSONWithJSONObject(String jsonData)
    {
            try {
                JSONObject jsonObject = new JSONObject(jsonData);
                String name=jsonObject.getString("answer");
                Toast.makeText(LoginActivity.this,name,Toast.LENGTH_SHORT).show();
                } catch (JSONException e) {
                e.printStackTrace();
            }
    }

}







