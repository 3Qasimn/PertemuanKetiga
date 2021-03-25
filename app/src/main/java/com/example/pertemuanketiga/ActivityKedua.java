package com.example.pertemuanketiga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {
    //text view
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        txEmail = findViewById(R.id.emailField);
        txPassword = findViewById(R.id.passwordField);

        //Mendeclarasikan bundle yang digunakan untuk mengambil pesan
        //Yang dikirim melalui method intent
        Bundle bundle = getIntent().getExtras();

        //Membuat variabel string untuk menyimpan data yang dikirim
        //Dari activity sebelumnya
        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        // menampilkan value
        txEmail.setText(email);
        txPassword.setText(pass);
    }
}