package com.exampel.uas_pm1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class sub_menu extends AppCompatActivity implements Pelajaran1Adapter.adapterListener {

    private RecyclerView rv_pelajaran;
    private Pelajaran1Adapter Pelajaran1Adapter;
    private ArrayList<pelajaran1> list_item = new ArrayList<>();
    private TextView txt_judul,txt_deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sub_menu);

        txt_judul = findViewById(R.id.txt_judul);
        txt_deskripsi = findViewById(R.id.txt_deskripsi);
        rv_pelajaran = findViewById(R.id.rv_pelajaran);
        Intent result = getIntent();




        if (result.getStringExtra("BHS").equals("HTML")){
            String v_Judul = "HTML";
            String v_Deskripsi = "Hypertext Markup Language adalah bahasa markah standar untuk dokumen yang dirancang untuk ditampilkan di peramban internet.";
            txt_judul.setText(v_Judul);
            txt_deskripsi.setText(v_Deskripsi);

            declareDataHTML();
            setRecyclerView(list_item);
        }
        else if(result.getStringExtra("BHS").equals("CSS")){
            String v_Judul = "CSS";
            String v_Deskripsi = "Cascading Style Sheet merupakan aturan untuk mengatur beberapa komponen dalam sebuah web.";
            txt_judul.setText(v_Judul);
            txt_deskripsi.setText(v_Deskripsi);

            declareDataCSS();
            setRecyclerView(list_item);
        }
        else if(result.getStringExtra("BHS").equals("JS")){
            String v_Judul = "Java Script";
            String v_Deskripsi = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis.";
            txt_judul.setText(v_Judul);
            txt_deskripsi.setText(v_Deskripsi);

            declareDataJS();
            setRecyclerView(list_item);
        }
    }

    private void setRecyclerView(List<pelajaran1> list_menu){
        Pelajaran1Adapter = new Pelajaran1Adapter(sub_menu.this, list_item, this);
        rv_pelajaran.setLayoutManager(new LinearLayoutManager(this));
//        rv_barang.setLayoutManager(new GridLayoutManager(this,2));
        rv_pelajaran.setAdapter(Pelajaran1Adapter);
        Pelajaran1Adapter.notifyDataSetChanged();
    }


    public void declareDataHTML(){
        pelajaran1 p = new pelajaran1();
        p.setCode("item_1");
        p.setJudul("Pendahuluan HTML");
        p.setDeskripsi("Jadi, HTML itu adalah sebuah bahasa yang menggunakan markup atau penanda untuk membuat halaman web. Penanda atau markup ini, nanti akan kita sebut dengan Tag. HTML berperan untuk menentukan struktur konten dan tampilan dari sebuah web.");
        p.setTokenytb("NBZ9Ro6UKV8");
        p.setGambar(R.drawable.logo_html);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_2");
        p.setJudul("Hello World!");
        p.setDeskripsi("Pembuatan web dimulai dengan desain. Kalau tidak ada desain, nanti kita akan kesulitan dan tidak akan tahu mau buat apa.");
        p.setTokenytb("1NicaVOCXHA");
        p.setGambar(R.drawable.logo_html);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_3");
        p.setJudul("Code Editor");
        p.setDeskripsi("At W3Schools you will find complete references about HTML elements, attributes, events, color names, entities, character-sets, URL encoding, language codes, HTTP messages, browser support");
        p.setTokenytb("3sLSi9L5nWE");
        p.setGambar(R.drawable.logo_html);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_4");
        p.setJudul("Tag");
        p.setDeskripsi("Apa itu Tag? Tag adalah sebauh penanda awalan dan akhiran dari sebuah elemen di HTML. Tag dibuat dengan kurung siku (<...>), lalu di dalamnya berisi nama tag dan kadang juga ditambahkan dengan atribut.");
        p.setTokenytb("cUWBYzA6M-8");
        p.setGambar(R.drawable.logo_html);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_5");
        p.setJudul("Paragraf");
        p.setDeskripsi("Paragraf adalah kumpulan dari beberapa kalimat. Pada web, Paragraf biasanya digunakan untuk menampilkan teks atau artikel. Paragraf pada HTML dibuat dengan tag <p>. Selain tag ini, ada juga tag pendukung lain seperti ");
        p.setTokenytb("Dl_bIYBc9gM");
        p.setGambar(R.drawable.logo_html);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_6");
        p.setJudul("Heading");
        p.setDeskripsi("Heading adalah sebuah judul yang biasanya diberikan pada halaman atau beberapa bagian dari artikel");
        p.setTokenytb("SMetRBdIh-8");
        p.setGambar(R.drawable.logo_html);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_7");
        p.setJudul("List");
        p.setDeskripsi("HTML sudah menyediakan elemen untuk membuat list. Ada tiga macam jenis list yang bisa dibuat di HTML");
        p.setTokenytb("gLHEoeupIZs");
        p.setGambar(R.drawable.logo_html);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_8");
        p.setJudul("Hyperlink");
        p.setDeskripsi("Link atau Hyperlink adalah elemen HTML yang berfungsi menghubungkan suatu halaman web ke halaman web yang lain.");
        p.setTokenytb("QIlBOI-hTuA");
        p.setGambar(R.drawable.logo_html);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_9");
        p.setJudul("Image");
        p.setDeskripsi("Gambar akan membuat website kita terlihat lebih menarik. Karena otak kita lebih mudah menyerap informasi dengan visual dibandingkan hanya teks saja.");
        p.setTokenytb("yb_emYhY3Pc");
        p.setGambar(R.drawable.logo_html);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_10");
        p.setJudul("Table");
        p.setDeskripsi("Tag yang paling penting untuk diingat adalah tag table, tr, dan  td. Sementara tag yang lain adalah tambahan (opsional), boleh digunakan boleh tidak.");
        p.setTokenytb("7-QNafrXigs");
        p.setGambar(R.drawable.logo_html);
        list_item.add(p);

    }
    public void declareDataCSS(){
        pelajaran1 p = new pelajaran1();
        p.setCode("item_1");
        p.setJudul("Pendahuluan");
        p.setDeskripsi("CSS (Cascade Style Sheet) meruapakan sebuah bahasa untuk mengatur tampilan web sehingga terlihat lebih menarik dan indah. Deskripsi 1");
        p.setTokenytb("CleFk3BZB3g");
        p.setGambar(R.drawable.logo_css);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_2");
        p.setJudul("Anatomi CSS");
        p.setDeskripsi("CSS (Cascade Style Sheet) meruapakan sebuah bahasa untuk mengatur tampilan web sehingga terlihat lebih menarik dan indah. Deskripsi 2");
        p.setTokenytb("8lXDi2Mxp9c");
        p.setGambar(R.drawable.logo_css);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_3");
        p.setJudul("Penempatan CSS");
        p.setDeskripsi("CSS (Cascade Style Sheet) meruapakan sebuah bahasa untuk mengatur tampilan web sehingga terlihat lebih menarik dan indah. Deskripsi 3");
        p.setTokenytb("8lXDi2Mxp9c");
        p.setGambar(R.drawable.logo_css);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_4");
        p.setJudul("Font Styling");
        p.setDeskripsi("CSS (Cascade Style Sheet) meruapakan sebuah bahasa untuk mengatur tampilan web sehingga terlihat lebih menarik dan indah. Deskripsi 4");
        p.setTokenytb("nPHed3_oPvY");
        p.setGambar(R.drawable.logo_css);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_5");
        p.setJudul("Text Styling");
        p.setDeskripsi("CSS (Cascade Style Sheet) meruapakan sebuah bahasa untuk mengatur tampilan web sehingga terlihat lebih menarik dan indah. Deskripsi 5");
        p.setTokenytb("xih8giA7S3Q");
        p.setGambar(R.drawable.logo_css);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_6");
        p.setJudul("Background");
        p.setDeskripsi("CSS (Cascade Style Sheet) meruapakan sebuah bahasa untuk mengatur tampilan web sehingga terlihat lebih menarik dan indah. Deskripsi 6");
        p.setTokenytb("zm-HPYS_ELU");
        p.setGambar(R.drawable.logo_css);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_7");
        p.setJudul("Selector");
        p.setDeskripsi("CSS (Cascade Style Sheet) meruapakan sebuah bahasa untuk mengatur tampilan web sehingga terlihat lebih menarik dan indah. Deskripsi 7");
        p.setTokenytb("0KLwWyQyMQo");
        p.setGambar(R.drawable.logo_css);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_8");
        p.setJudul("Pesudo Class");
        p.setDeskripsi("CSS (Cascade Style Sheet) meruapakan sebuah bahasa untuk mengatur tampilan web sehingga terlihat lebih menarik dan indah. Deskripsi 8");
        p.setTokenytb("G0gYWdIHOug");
        p.setGambar(R.drawable.logo_css);
        list_item.add(p);




    }
    public void declareDataJS(){
        pelajaran1 p = new pelajaran1();
        p.setCode("item_1");
        p.setJudul("Intro");
        p.setDeskripsi("Di seri ini kita akan mempelajari mengenai konsep dasar pemrograman, istilah2 yang ada dalam dunia pemrograman, cara menulis dan mengeksekusi program, dll.");
        p.setTokenytb("RUTV_5m4VeI");
        p.setGambar(R.drawable.logo_js);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_2");
        p.setJudul("Apa itu pemrograman");
        p.setDeskripsi("Sebelum mulai ngoding, ada baiknya kita tau dulu apa itu pemrograman dan program itu sendiri..");
        p.setTokenytb("Ncrlg9kTC6U");
        p.setGambar(R.drawable.logo_js);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_3");
        p.setJudul("Bahasa Pemrograman");
        p.setDeskripsi("apa itu bahasa pemrograman? ada bahasa pemrograman apa aja? yang paling bagus yang mana?nah, di video ini kita akan bahas itu semua sebelum kita mulai ngoding.. disimak yaa.. :)");
        p.setTokenytb("dugL0oYx0w0");
        p.setGambar(R.drawable.logo_js);
        list_item.add(p);

        p = new pelajaran1();
        p.setCode("item_4");
        p.setJudul("Compiler vs Interpreter");
        p.setDeskripsi("Tiap2 bahasa pemrograman memiliki sesuatu yang dinamakan compiler atau interpreter, yang berfungsi untuk melakukan sesuatu terhadap source code kita agar bisa menjadi program yang bisa dijalankan.. Video ini menjelaskan mengenai apa itu compiler & interpreter, bagaimana cara kerjanya, dan bahasa pemrograman apa yang memiliki 2 hal tersebut.. ");
        p.setTokenytb("gCBysZKiU3Y");
        p.setGambar(R.drawable.logo_js);
        list_item.add(p);






    }


    @Override
    public void tariksis(String txt_token,String txt_deskripsi,String txt_judul ) {
//        Toast.makeText(this, ""+txt_deskripsi, Toast.LENGTH_SHORT).show();

        Intent Primitif = new Intent( sub_menu.this,konten.class);
        Primitif.putExtra("TOKEN",txt_token);
        Primitif.putExtra("DES",txt_deskripsi);
        Primitif.putExtra("JUDUL",txt_judul);
        startActivity(Primitif);
    }
}