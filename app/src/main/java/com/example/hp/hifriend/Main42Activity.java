package com.example.hp.hifriend;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main42Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main42);
    }
    public void f8(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "http://web.facebook.com/profile.php?id=100010826921756"));
        startActivity(browserIntent);}
}
