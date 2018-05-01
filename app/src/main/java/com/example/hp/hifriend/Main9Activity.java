package com.example.hp.hifriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }
    public void Next27(View view){
        Intent ab=new Intent(Main9Activity.this,Main22Activity.class);
        startActivity(ab);
    }
    public void Next28(View view){
        Intent ab=new Intent(Main9Activity.this,Main23Activity.class);
        startActivity(ab);
    }
    public void Next55(View view){
        Intent ab=new Intent(Main9Activity.this,Main52Activity.class);
        startActivity(ab);
    }
}
