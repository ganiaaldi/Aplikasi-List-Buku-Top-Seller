package com.example.topsellerbook_submission_ganiaaldi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_FROM = "extra_from";
    public static final String EXTRA_PHOTO = "extra_photo";
    public static final String EXTRA_DESCRIPTION = "extra_description";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView tvDataReceived = findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int from = getIntent().getIntExtra(EXTRA_FROM, 0);
        int description = getIntent().getIntExtra(EXTRA_DESCRIPTION, 0);
        String text = "Judul Buku : " + name +
                ",\nPenulis : " +  from +
        ",\nDeskripsi : " +  description;
        tvDataReceived.setText(text);
    }
}
