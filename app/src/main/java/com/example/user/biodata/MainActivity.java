package com.example.user.biodata;

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

    public void callPhone(View view){
        Uri uri = Uri.parse("tel:081225111209");
        Intent it = new Intent (Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void goMaps (View view){
        Uri uri = Uri.parse("geo:-7.041514, 110.462350");
        Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void goEmail (View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"nandahandayani85@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android Studio");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }

}
