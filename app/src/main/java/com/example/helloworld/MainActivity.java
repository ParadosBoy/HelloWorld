package com.example.helloworld;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity","Verbose");
        Log.d("MainActivity","Debug");
        Log.i("MainActivity","Info");
        Log.w("MainActivity","Warning");
        Log.e("MainActivity","Error");
        Log.wtf("MainActivity","Assert");
    }
}