package com.example.rview;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewContentName;
    private ImageView imageView;
    private TextView textViewTitleName;
    private CircleImageView circleImageView;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_second);

        textViewContentName = findViewById(R.id.content);
        textViewTitleName = findViewById(R.id.title);
        imageView = findViewById(R.id.image_view);
        circleImageView = findViewById(R.id.circleimage);

        String content = getIntent().getStringExtra("content");
        textViewContentName.setText(content);

        String title = getIntent().getStringExtra("title");
        textViewTitleName.setText(title);

        String image = getIntent().getStringExtra("image");

        Log.d("qwerty",  "getIncomingIntent: found intent extras. " + image);
        Glide.with(this)
                .asBitmap()
                .load(image)
                .into(imageView);


        String logo = getIntent().getStringExtra("logo");
        Log.d("qwerty2",  "getIncomingIntent: found intent extras. " + logo);
        Glide.with(this)
                .asBitmap()
                .load(logo)
                .into(circleImageView);


    }
}
