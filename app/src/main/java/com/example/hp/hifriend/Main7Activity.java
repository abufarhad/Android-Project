package com.example.hp.hifriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void Next24(View view){
        Intent ab=new Intent(Main7Activity.this,Main13Activity.class);
        startActivity(ab);
    }
    public void Next25(View view){
        Intent ab=new Intent(Main7Activity.this,Main21Activity.class);
        startActivity(ab);
    }
    public void Next48(View view){
        Intent ab=new Intent(Main7Activity.this,Main45Activity.class);
        startActivity(ab);
    }
    public void Next49(View view){
        Intent ab=new Intent(Main7Activity.this,Main46Activity.class);
        startActivity(ab);
    }
    public void Next60(View view){
        Intent ab=new Intent(Main7Activity.this,Main56Activity.class);
        startActivity(ab);
    }
}
