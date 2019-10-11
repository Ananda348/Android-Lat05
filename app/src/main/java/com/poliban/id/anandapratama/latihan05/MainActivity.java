package com.poliban.id.anandapratama.latihan05;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAjax = findViewById(R.id.btAjax);
        Button btFiorentina = findViewById(R.id.btFiorentina);
        Button btRealMadrid = findViewById(R.id.btRealMadrid);

        //Event Handler
        btAjax.setOnClickListener (view -> Toast.makeText(this, "Hi Ajax", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener (view -> Toast.makeText(this, "Hi Fiorentina", Toast.LENGTH_SHORT).show());
        btRealMadrid.setOnClickListener (view -> Toast.makeText(this, "Hi Real Madrid", Toast.LENGTH_SHORT).show());
    }
}
