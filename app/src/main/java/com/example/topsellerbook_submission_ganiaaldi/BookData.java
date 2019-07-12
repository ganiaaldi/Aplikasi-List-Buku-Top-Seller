package com.example.topsellerbook_submission_ganiaaldi;

import java.util.ArrayList;

public class BookData {
    public static String[][] data = new String[][]{
            {"Tere Liye", "Tere Liye kembali merilis buku terbarunya pada Maret 2019 lalu. Kali ini berjudul Komet Minor, yang merupakan buku bungsu dari Seri Bumi. Seri yang menceritakan tiga sahabat remaja, Ali, Raib dan Seli yang bertualang ke negeri paralel dan harus menghadapi tokoh antagonis, Si Tanpa Mahkota.", "drawable-v24/komet-minor.jpg"},

    };
    public static ArrayList<Book> getListData(){
        ArrayList<Book> list = new ArrayList<>();
        for (String[] aData : data) {
            Book book = new Book();
            book.setName(aData[0]);
            book.setFrom(aData[1]);
            book.setPhoto(aData[2]);
            list.add(book);
        }
        return list;
    }
}

