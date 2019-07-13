package com.example.topsellerbook_submission_ganiaaldi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = findViewById(R.id.imageView);
        imageView.setBackgroundResource(R.drawable.ic_gm);


        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
        case R.id.btn_move_activity:
        Intent moveIntent=new Intent(MainActivity.this,ListActivity.class);
        startActivity(moveIntent);
        break;
        }
        }

}






