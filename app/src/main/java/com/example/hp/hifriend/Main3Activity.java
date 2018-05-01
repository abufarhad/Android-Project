package com.example.hp.hifriend;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void Next11(View view){
        Intent ab=new Intent(Main3Activity.this,Main13Activity.class);
        startActivity(ab);
    }

    public void Next12(View view){
        Intent ab=new Intent(Main3Activity.this,Main14Activity.class);
        startActivity(ab);
    }
    public void Next13(View view){
        Intent ab=new Intent(Main3Activity.this,Main15Activity.class);
        startActivity(ab);
    }
    public void Next14(View view){
        Intent ab=new Intent(Main3Activity.this,Main16Activity.class);
        startActivity(ab);
    }
    public void f14(View view){
        Intent ab=new Intent(Main3Activity.this,Main41Activity.class);
        startActivity(ab);
    }
    public void f5(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "http://web.facebook.com/groups/164584723905582/?ref=br_rs"));
        startActivity(browserIntent);}

}
