package com.example.restaurantguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
    TextView txtName,txtAddress,txtPhone,txtDesc,txtTag;
    RatingBar ratingBar;
    String id,name,address,phone,description,tag,rating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        txtName = findViewById(R.id.restaurant_name);
        txtAddress = findViewById(R.id.restaurant_address);
        txtPhone = findViewById(R.id.restaurant_phone);
        txtDesc = findViewById(R.id.restaurant_desc);
        txtTag = findViewById(R.id.restaurant_tag);
        ratingBar = findViewById(R.id.rating);

        Intent intent = getIntent();
        id = intent.getStringExtra("ID");
        name = intent.getStringExtra("NAME");
        address = intent.getStringExtra("ADDRESS");
        phone = intent.getStringExtra("PHONE");
        description = intent.getStringExtra("DESC");
        tag = intent.getStringExtra("TAG");
        rating = intent.getStringExtra("RATING");

        txtName.setText(name);
        txtAddress.setText(address);
        txtPhone.setText(phone);
        txtDesc.setText(description);
        txtTag.setText(tag);
        ratingBar.setRating(Float.parseFloat(rating));
    }
}