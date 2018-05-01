package com.example.hp.hifriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main35Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main35);
    }
    public void Next41(View view){
        Intent ab=new Intent(Main35Activity.this,Main36Activity.class);
        startActivity(ab);
    }
    public void Next50(View view){
        Intent ab=new Intent(Main35Activity.this,Main47Activity.class);
        startActivity(ab);
    }
}
