package com.example.topsellerbook_submission_ganiaaldi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    public RecyclerView rvBook;
    public ArrayList<Book> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        rvBook = findViewById(R.id.rv_book) ;

        rvBook.setHasFixedSize(true);

        list.addAll(BookData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvBook.setLayoutManager(new LinearLayoutManager(this));
        ListBookAdapter listBookAdapter = new ListBookAdapter(list);
        rvBook.setAdapter(listBookAdapter);
    }
}
