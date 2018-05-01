package com.example.hp.hifriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main32Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);
    }
    public void Next38(View view){
        Intent ab=new Intent(Main32Activity.this,Main33Activity.class);
        startActivity(ab);
    }
    public void Next39(View view){
        Intent ab=new Intent(Main32Activity.this,Main34Activity.class);
        startActivity(ab);
    }
}
