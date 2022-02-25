package com.example.parcialmelvinjaime;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Numeros extends AppCompatActivity {
    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        btn1=(ImageButton) findViewById(R.id.btn1);
        btn2=(ImageButton) findViewById(R.id.btn2);
        btn3=(ImageButton) findViewById(R.id.btn3);
        btn4=(ImageButton) findViewById(R.id.btn4);
        btn5=(ImageButton) findViewById(R.id.btn5);
        btn6=(ImageButton) findViewById(R.id.btn6);
        btn7=(ImageButton) findViewById(R.id.btn7);
        btn8=(ImageButton) findViewById(R.id.btn8);
        btn9=(ImageButton) findViewById(R.id.btn9);
        btn10=(ImageButton) findViewById(R.id.btn10);

        mp1=MediaPlayer.create(this,R.raw.numero1);
        mp2=MediaPlayer.create(this,R.raw.numero2);
        mp3=MediaPlayer.create(this,R.raw.numero3);
        mp4=MediaPlayer.create(this,R.raw.nunero4);
        mp5=MediaPlayer.create(this,R.raw.numero5);
        mp6=MediaPlayer.create(this,R.raw.numero6);
        mp7=MediaPlayer.create(this,R.raw.numero7);
        mp8=MediaPlayer.create(this,R.raw.numeeo8);
        mp9=MediaPlayer.create(this,R.raw.numero9);
        mp10=MediaPlayer.create(this,R.raw.numero10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.start();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp6.start();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp7.start();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp8.start();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp9.start();
            }
        });btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp10.start();
            }
        });



    }
}