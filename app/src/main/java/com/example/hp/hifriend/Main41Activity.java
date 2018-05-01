package com.example.hp.hifriend;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main41Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main41);
    }

    public void f9(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "http://infopedia.com.bd/education/feature/691"));
        startActivity(browserIntent);}
    public void f10(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "http://web.facebook.com/RUETAdmissiontesthelpline/posts/920135028071218?_rdc=1&_rdr"));
        startActivity(browserIntent);}
    public void f11(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "https://web.facebook.com/KUET.AHC/posts/230954727081123?_rdc=1&_rdr"));
        startActivity(browserIntent);}
    public void f12(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "https://web.facebook.com/CUET.PME/posts/489524634495804?_rdc=1&_rdr"));
        startActivity(browserIntent);}
    public void f13(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse( "http://lekhaporabd.com/archives/10048"));
        startActivity(browserIntent);}
}
