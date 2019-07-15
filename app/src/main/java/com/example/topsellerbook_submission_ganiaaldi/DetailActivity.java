package com.example.topsellerbook_submission_ganiaaldi;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {


    ImageView img;
    TextView namapenulis, njudulbuku, ndeskripsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent moveDetailActivity = getIntent();
        String penulis= moveDetailActivity.getExtras().getString("penulis");
        String judulbuku = moveDetailActivity.getExtras().getString("judulbuku");
        String deskripsi = moveDetailActivity.getExtras().getString("deskripsi");
        int photo= moveDetailActivity.getExtras().getInt("photo");


        img = findViewById(R.id.detail_buku);
        namapenulis = findViewById(R.id.tv_item_name);
        njudulbuku = findViewById(R.id.tv_item_from);
        ndeskripsi = findViewById(R.id.tv_item_description);

        img.setImageResource(photo);
        namapenulis.setText(penulis);
        njudulbuku.setText(judulbuku);
        ndeskripsi.setText(deskripsi);
    }
}
