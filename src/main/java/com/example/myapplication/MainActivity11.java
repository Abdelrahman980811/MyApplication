package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }


    public void checkbtn(View view){

        try {
            Intent sendemail = new Intent(Intent.ACTION_SEND);
            sendemail.setData(Uri.parse("mailto:"));
            sendemail.setType("message/rfc822");
            sendemail.putExtra(Intent.EXTRA_EMAIL,"Ahmedbayome3434@gmail.com");
//            sendemail.putExtra(Intent.EXTRA_SUBJECT),"message tittle ";
  //          sendemail.putExtra(Intent.EXTRA_TEXT),"message content ";
            startActivity(sendemail);
        }

        catch (Exception e){
            Toast.makeText(this,"sorry there is no email app",Toast.LENGTH_LONG).show();
        }

    }


    //public void checkbtn(View v){
      //  Intent intent= new Intent(MainActivity11.this,Main3Activity.class);
        //startActivity(intent);

    //}

}
