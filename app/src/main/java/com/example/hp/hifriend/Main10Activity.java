package com.example.hp.hifriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
    }
    public void Next29(View view){
        Intent ab=new Intent(Main10Activity.this,Main24Activity.class);
        startActivity(ab);
    }
    public void Next30(View view){
        Intent ab=new Intent(Main10Activity.this,Main25Activity.class);
        startActivity(ab);
    }
    public void Next31(View view){
        Intent ab=new Intent(Main10Activity.this,Main26Activity.class);
        startActivity(ab);
    }
    public void Next32(View view){
        Intent ab=new Intent(Main10Activity.this,Main27Activity.class);
        startActivity(ab);
    }
    public void Next33(View view){
        Intent ab=new Intent(Main10Activity.this,Main28Activity.class);
        startActivity(ab);
    }
    public void Next34(View view){
        Intent ab=new Intent(Main10Activity.this,Main29Activity.class);
        startActivity(ab);
    }
    public void Next52(View view){
        Intent ab=new Intent(Main10Activity.this,Main49Activity.class);
        startActivity(ab);
    }
    public void Next59(View view){
        Intent ab=new Intent(Main10Activity.this,Main54Activity.class);
        startActivity(ab);
    }
}
