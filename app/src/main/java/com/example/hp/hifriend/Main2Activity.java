package com.example.hp.hifriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Next1(View view){
        Intent ab=new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(ab);
    }
    public void Next2(View view){
        Intent ab=new Intent(Main2Activity.this,Main4Activity.class);
        startActivity(ab);
    }
    public void Next3(View view){
        Intent ab=new Intent(Main2Activity.this,Main5Activity.class);
        startActivity(ab);
    }

    public void Next4(View view){
        Intent ab=new Intent(Main2Activity.this,Main6Activity.class);
        startActivity(ab);
    }
    public void Next5(View view){
        Intent ab=new Intent(Main2Activity.this,Main7Activity.class);
        startActivity(ab);
    }
    public void Next6(View view){
        Intent ab=new Intent(Main2Activity.this,Main8Activity.class);
        startActivity(ab);
    }
    public void Next7(View view){
        Intent ab=new Intent(Main2Activity.this,Main9Activity.class);
        startActivity(ab);
    }
    public void Next8(View view){
        Intent ab=new Intent(Main2Activity.this,Main10Activity.class);
        startActivity(ab);
    }
    public void Next9(View view){
        Intent ab=new Intent(Main2Activity.this,Main11Activity.class);
        startActivity(ab);
    }

    public void Next37(View view){
        Intent ab=new Intent(Main2Activity.this,Main32Activity.class);
        startActivity(ab);
    }
    public void Next40(View view){
        Intent ab=new Intent(Main2Activity.this,Main35Activity.class);
        startActivity(ab);
    }
}
