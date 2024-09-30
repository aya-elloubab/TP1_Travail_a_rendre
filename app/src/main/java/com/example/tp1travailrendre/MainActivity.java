package com.example.tp1travailrendre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText nom, email, adresse, phone;
    private Spinner ville;
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nameET);
        email = findViewById(R.id.emailET);
        adresse = findViewById(R.id.adressET);
        ville = findViewById(R.id.villeSpinner);
        phone = findViewById(R.id.phoneET);
        send = findViewById(R.id.sendBn);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                intent.putExtra("name", nom.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("adress", adresse.getText().toString());
                intent.putExtra("ville", ville.getSelectedItem().toString());
                startActivity(intent);
            }
        });

    }
}