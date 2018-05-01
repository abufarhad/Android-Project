package com.example.hp.hifriend;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main16Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
    }
    public void f4(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "http://web.facebook.com/iftekharulahsan.chowdhury"));
        startActivity(browserIntent);}
}
