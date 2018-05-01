package com.example.hp.hifriend;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Next(View view){
        Intent ab=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(ab);
    }
    public void Next44(View view){
        Intent ab=new Intent(MainActivity.this,Main39Activity.class);
        startActivity(ab);
    }

    public void Next45(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "http://web.facebook.com/abu.farhad.754?_rdc=1&_rdr"));
        startActivity(browserIntent);}
   /* public void  Farhad(View view){
        Intent abc=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(abc);
    } */
}
