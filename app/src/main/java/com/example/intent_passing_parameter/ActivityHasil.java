package com.example.intent_passing_parameter;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityHasil extends AppCompatActivity {
    //Mendeklarasikan variabel dengan tipe data TextView
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil2);

        //Menghubungkan variabel txEmail dengan componen Textview pada Layout
        txEmail = findViewById(R.id.tvEmail);

        //Menghubungkan variabel txPassword dengan componen Textview pada Layout
        txPassword = findViewById(R.id.tvPassword);

        //mendeklarasikan variabel bundle yang akan digunakan untuk mengambil
        //pesan yang dikirimkan melalui metod intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "a"
        String email = bundle.getString("a");

        //membuat variabel string yang digunakan untuk menyimpan data yang
        //dikirimkan dari activity sebelumnya dengan kunci "b"
        String pass = bundle.getString("b");

        //menampilkan value dari variabel email ke dalam txEmail
        txEmail.setText(email);

        //menampilkan value dari variabel email ke dalam txPassword
        txPassword.setText(pass);


    }
}