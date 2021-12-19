package com.futech.onlineimageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView onlineImg1, onlineImg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onlineImg1=findViewById(R.id.imageView);
        onlineImg2=findViewById(R.id.imageView2);


        String uri="https://p0.pikist.com/photos/206/449/squid-stir-fry-squid-training-years-cooking-recipe-korea-food-fried-squid.jpg";
        Picasso.get().load(uri).placeholder(R.drawable.avatar).into(onlineImg1);

        Picasso.get().load("https://p0.pxfuel.com/preview/117/857/65/cake-cheesecake-dessert-sweet.jpg").placeholder(R.drawable.avatar).into(onlineImg2);
    }
}