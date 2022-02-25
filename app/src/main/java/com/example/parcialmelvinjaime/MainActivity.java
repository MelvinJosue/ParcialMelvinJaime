package com.example.parcialmelvinjaime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnsiguiente;
    Button btnnumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsiguiente=findViewById(R.id.btnpasaraimc);
        btnnumeros=findViewById(R.id.btn110);


        btnsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,MainActivity2Imc.class);
                startActivity(intent);
            }
        });
        btnnumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,Numeros.class);
                startActivity(intent);
            }
        });
    }
}