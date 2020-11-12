package com.example.edittextrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name;
    TextView price;
    String name1,price1;
    String image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView=findViewById(R.id.detail_profile_image);
        name=findViewById(R.id.detail_name);
        price=findViewById(R.id.detail_price);
        Bundle bundle=getIntent().getExtras();
        name1=bundle.getString("name");
        price1=bundle.getString("price");
        image1=bundle.getString("profile_image");
        name.setText(name1);
        price.setText(price1);
        Glide.with(getApplicationContext()).load("https://dumpin.in/paaniwaala/public/uploads/products/" + image1).into(imageView);
    }
}
