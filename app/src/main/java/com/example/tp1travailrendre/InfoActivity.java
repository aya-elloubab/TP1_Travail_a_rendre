package com.example.tp1travailrendre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    private TextView name, phone, email, adress, ville;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        name = findViewById(R.id.nameTv);
        phone = findViewById(R.id.phoneTv);
        email = findViewById(R.id.emailTv);
        adress = findViewById(R.id.adressTv);
        ville = findViewById(R.id.villeTv);

        Intent intent = getIntent();
        String nom = intent.getStringExtra("name");
        String telephone = intent.getStringExtra("phone");
        String e_mail = intent.getStringExtra("email");
        String adresse = intent.getStringExtra("adress");
        String villes = intent.getStringExtra("ville");

        name.setText("Nom: "+nom);
        phone.setText("Phone: "+telephone);
        email.setText("Email :"+e_mail);
        adress.setText("Adresse: "+adresse);
        ville.setText("Ville: "+villes);

    }
}