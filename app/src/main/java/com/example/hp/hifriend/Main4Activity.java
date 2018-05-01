package com.example.hp.hifriend;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void Next15(View view){
        Intent ab=new Intent(Main4Activity.this,Main17Activity.class);
        startActivity(ab);
    }
    public void f15(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "http://web.facebook.com/groups/164584723905582/?ref=br_rs"));
        startActivity(browserIntent);}
}
