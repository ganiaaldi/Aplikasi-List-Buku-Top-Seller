package com.example.topsellerbook_submission_ganiaaldi;

import java.util.ArrayList;

public class BookData {
    public static String[][] data = new String[][]{

            {"Bumi Manusia", "Pramoedya Ananta Toer","R.drawable.bumimanusia" },
            {"Cara Berbahagia Tanpa Kepala", "Triskaidekaman", "R.drawable.caraberbahagiatanpakepala"},
            {"Five Feet Apart", "Rachael Lippincott, Mikki Daughtry, Tobias Iaconis", "R.drawable.fivefeetapart"},
            {"Komet Minor", "Tere Liye", "R.drawable.kometminor"},
            {"Norwegian Wood", "Haruki Murakami", "R.drawable.norwegianwood"},
            {"Orang-Orang Biasa", "Tere Liye", "R.drawable.orangorangbiasa"},
            {"Rich People Problems", "Kevin Kwan", "R.drawable.richpeopleproblems"},
            {"Senja Dan Pagi", "Alffy Rev", "R.drawable.senjadanpagi"},
            {"The Girl Who Drank Moon", "Kelly Barnhill", "R.drawable.thegirlwhodrankmoon"},
            {"This Is Why I Need you", "Brian Khrisna", "R.drawable.thisiswhyineedyou"},
    };

    public static int[][] data1 = new int[][]{
            {R.drawable.bumimanusia},
            {R.drawable.caraberbahagiatanpakepala},
            {R.drawable.fivefeetapart},
            {R.drawable.kometminor},
            {R.drawable.norwegianwood},
            {R.drawable.orangorangbiasa},
            {R.drawable.richpeopleproblems},
            {R.drawable.senjadanpagi},
            {R.drawable.thegirlwhodrankmoon},
            {R.drawable.thisiswhyineedyou},
    };
    public static ArrayList<Book> getListData(){
        ArrayList<Book> list = new ArrayList<>();
        Book book = null;

        for(int i=0; i<=9; i++){
            book= new Book();
            book.setPhoto(data1[i][0]);
            book.setFrom(data[i][1]);
            book.setName(data[i][0]);


                list.add(book);

        }
        return list;
    }
}

