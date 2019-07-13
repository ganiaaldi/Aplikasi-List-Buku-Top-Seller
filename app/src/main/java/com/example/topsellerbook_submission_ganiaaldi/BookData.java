package com.example.topsellerbook_submission_ganiaaldi;

import java.util.ArrayList;

public class BookData {
    public static String[][] data = new String[][]{

            {"Bumi Manusia", "Pramoedya Ananta Toer","drawable/bumimanusia.jpg" },
            {"Cara Berbahagia Tanpa Kepala", "Triskaidekaman", "drawable/caraberbahagiatanpakepala.jpg"},
            {"Five Feet Apart", "Rachael Lippincott, Mikki Daughtry, Tobias Iaconis", "drawable/fivefeetapart.jpg"},
            {"Komet Minor", "Tere Liye", "drawable/kometminor.jpg"},
            {"Norwegian Wood", "Haruki Murakami", "drawable/norwegianwood.jpg"},
            {"Orang-Orang Biasa", "Tere Liye", "drawable/orangorangbiasa.jpg"},
            {"Rich People Problems", "Kevin Kwan", "drawable/richpeopleproblems.jpg"},
            {"Senja Dan Pagi", "Alffy Rev", "drawable/senjadanpagi.jpg"},
            {"The Girl Who Drank Moon", "Kelly Barnhill", "drawable/thegirlwhodrankmoon.jpg"},
            {"This Is Why I Need you", "Brian Khrisna", "drawable/thisiswhyineedyou.jpg"},
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

