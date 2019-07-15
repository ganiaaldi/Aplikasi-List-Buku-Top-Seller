package com.example.topsellerbook_submission_ganiaaldi;

import java.util.ArrayList;

public class BookData {
    public static String[][] data = new String[][]{

            {"Bumi Manusia", "Pramoedya Ananta Toer","R.drawable.bumimanusia" },
            {"Cara Berbahagia Tanpa Kepala", "Triskaidekaman", "R.drawable.caraberbahagiatanpakepala"},
            {"Five Feet Apart", "Rachael Lippincott, Mikki Daughtry, Tobias Iaconis", "R.drawable.fivefeetapart"},
            {"Komet Minor", "Tere Liye", "R.drawable.kometminor"},
            {"Norwegian Wood", "Haruki Murakami", "R.drawable.norwegianwood"},
            {"Orang-Orang Biasa", "Andrea Hirata", "R.drawable.orangorangbiasa"},
            {"Rich People Problems", "Kevin Kwan", "R.drawable.richpeopleproblems"},
            {"Senja Dan Pagi", "Alffy Rev", "R.drawable.senjadanpagi",},
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

    public static String[][] data2 = new String[][]{
            {"Naskah Bumi Manusia dibuat ketika Pram diasingkan dan di penjara di Pulau Buru. Naskah ini telah melewati masa-masa buruk bersama Pram mulai disembunyikan, dikubur, disita, hingga ditulis kembali.\n" +
                    "\n" +
                    "Kini, buku itu dielu-elukan sebagai karya sastra Indonesia terbesar dan mendapatkan 12 penghargaan Internasional."},
            {"Bagaimana jika suatu waktu kalian merasa kepala kalian tidak bisa memberikan solusi atas persoalan yang sedang kalian hadapi? Yang ada, isi kepala kalian justru membuat masalah semakin rumit.\n" +
                    "\n" +
                    "Dalam novel ini, Triskaidekaman, sebagai penulis, akan membawa kita pada perjalanan Sempati yang kehilangan kepalanya. Kehilangan kepala seperti apa yang dimaksud?"},
            {"Kisah antara Stella Grant dan Will newman ini memang patut untuk disimak. Will menjadi sosok yang harus Stella hindari. Salah ambil langkah, Stella kehilangan tempat dalam daftar transplantasi paru-paru.\n" +
                    "\n" +
                    "Bahkan salah satu dari mereka bisa mati. Satu-satunya cara agar mereka tetap hidup adalah dengan menjaga jarak. Namun, jarak dua meter sungguh seperti hukuman tanpa akhir untuk mereka."},
            {"Tere Liye kembali merilis buku terbarunya pada Maret 2019 lalu. Kali ini berjudul Komet Minor, yang merupakan buku bungsu dari Seri Bumi. Seri yang menceritakan tiga sahabat remaja, Ali, Raib dan Seli yang bertualang ke negeri paralel dan harus menghadapi tokoh antagonis, Si Tanpa Mahkota."},
            {"Norwegian Wood adalah salah satu karya Haruki yang mendunia. Buku ini pertama kali dirilis pada 1987 lalu di Jepang.\n" +
                    "\n" +
                    "Buku ini mengisahkan perjalanan seorang pemuda romantis bernama Toru dan kisah-kisah pilunya semasa menjadi mahasiswa."},
            {"Orang-Orang Biasa ini akan sangat berbeda dengan novel-novel Andrea Hirata sebelumnya. Sebab, novel ini bercerita mengenai sekelompok orang yang berencana untuk melakukan aksi kejahatan. Adapun motif yang melatarbelakangi mereka melakukan tindak kriminal ini pun tidak biasa dan cenderung membuat pembacanya mengelus dada. Pada novel ini pun, Andrea Hirata masih berbicara mengenai dunia pendidikan dengan gaya satire yang menggelitik dan menyayat hati sekaligus."},
            {"Buku ini adalah penutup trilogi Crazy Rich Asians karya Kevin Kwan. Tentunya, masih berkisah tentang Rachel dan Nick.\n" +
                    "\n" +
                    "Kaum jetset rasanya tak lengkap tanpa drama perebutan harta. Konflik perebutan harta itu menjadi highlight di buku ini."},
            {"Awwalur Rizqi Al-firori atau yang dikenal dengan nama Alffy Rev selama ini dikenal sebagai seorang youtuber sukses. Kini ia pun mencoba untuk menulis sebuah buku.\n" +
                    "\n" +
                    "Buku tersebut berjudul Senja & Pagi, seperti salah satu lagu yang ia ciptakan. Menurutnya kisah di Senja & Pagi bukan sekedar fiktif belaka, namun juga kisah dirinya bersama sang istri, Linka Angelia."},
            {"Setiap tahun pada periode tertentu, warga di Protektorat wajib mempersembahkan seorang bayi kepada Sang Penyihir supaya mereka tak terkena petaka. Sementara itu, Xan si penyihir yang baik, setiap tahun menyelamatkan seorang bayi yang diambilnya di hutan.\n" +
                    "\n" +
                    "Satu hari Xan menyelamatkan seorang anak bernama Luna, yang tak sengaja melakukan sesuatu dan membuatnya dipenuhi oleh kekuatan sihir. Xan tetap merawat Luna, sampai ia yakin Luna bisa mengendalikan kekuatan sihir yang dimilikinya."},
            {"Apa jadinya jika seorang mahasiswa, dengan badan atletis tinggi besar, harus tinggal di kos-kosan putri? Belum lagi, profesi sampingannya sebagai bartender di salah satu toko alkohol, bertolak belakang dengan jabatannya di sebuah organisasi kekeluargaan Masjid kampus."}
    };

    public static ArrayList<Book> getListData(){
        ArrayList<Book> list = new ArrayList<>();
        Book book = null;

        for(int i=0; i<=9; i++){
            book= new Book();
            book.setPhoto(data1[i][0]);
            book.setFrom(data[i][1]);
            book.setName(data[i][0]);
            book.setDescription(data2[i][0]);

                list.add(book);

        }
        return list;
    }
}

