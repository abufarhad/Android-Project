package com.example.hp.hifriend;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void Next16(View view){
        Intent ab=new Intent(Main5Activity.this,Main18Activity.class);
        startActivity(ab);
    }
    public void Next17(View view){
        Intent ab=new Intent(Main5Activity.this,Main16Activity.class);
        startActivity(ab);
    }
    public void Next18(View view){
        Intent ab=new Intent(Main5Activity.this,Main19Activity.class);
        startActivity(ab);
    }
    public void f6(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "http://web.facebook.com/groups/164584723905582/?ref=br_rs"));
        startActivity(browserIntent);}

    public void f7(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "http://10minuteschool.com/blog/dhaka-university-a-unit/"));
        startActivity(browserIntent);}


}
