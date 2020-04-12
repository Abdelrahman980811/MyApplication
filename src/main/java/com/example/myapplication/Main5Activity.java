package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }


    public void book_btn(View v){
        Intent intent= new Intent(Main5Activity.this,Main6Activity.class);
        startActivity(intent);

    }
    public void update_btn(View v){
        Intent intent= new Intent(Main5Activity.this,Main8Activity.class);
        startActivity(intent);

    }

    public void em_btn(View v){
        Intent intent= new Intent(Main5Activity.this,Main9Activity.class);
        startActivity(intent);

    }
    public void cancel_btn(View v){
        Intent intent= new Intent(Main5Activity.this,Main7Activity.class);
        startActivity(intent);

    }


}
