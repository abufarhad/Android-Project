package com.example.hp.hifriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void Next26(View view){
        Intent ab=new Intent(Main8Activity.this,Main15Activity.class);
        startActivity(ab);
    }
    public void Next47(View view){
        Intent ab=new Intent(Main8Activity.this,Main44Activity.class);
        startActivity(ab);
    }
}
