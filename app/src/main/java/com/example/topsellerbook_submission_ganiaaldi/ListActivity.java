package com.example.topsellerbook_submission_ganiaaldi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

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
        listBookAdapter.setOnItemClickCallback(new ListBookAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Book data) {
                showSelectedBook(data);
            }
        });
    }


    private void showSelectedBook (Book book) {

        Intent moveDetailActivity = new Intent(ListActivity.this,DetailActivity.class);
        moveDetailActivity.putExtra(DetailActivity.EXTRA_NAME, book.getName());
        moveDetailActivity.putExtra(DetailActivity.EXTRA_FROM, book.getFrom());
        moveDetailActivity.putExtra(DetailActivity.EXTRA_PHOTO, book.getPhoto());
        moveDetailActivity.putExtra(DetailActivity.EXTRA_DESCRIPTION, book.getDescription());
        startActivity(moveDetailActivity);

    }
}
