package com.example.android_broadcast_receiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=findViewById(R.id.imageId);

        Intent intent=getIntent();
        String action=intent.getAction();
        String type=intent.getType();
        Uri im=intent.getParcelableExtra(Intent.EXTRA_STREAM);

        //Intent.ACTION_SEND.equals(action) && type!=null
        if(Intent.ACTION_SEND ==action && type!=null)
        {
          // iv.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM));
          iv.setImageURI(im);

        }


    }
}