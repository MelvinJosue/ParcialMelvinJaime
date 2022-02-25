package com.example.parcialmelvinjaime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2Imc extends AppCompatActivity {
Button btnvolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_imc);
    }

    public static float f1=0,f2=0;

    public void btnHombreOnclick(View view){
        f1=2.7F;
        f2=47.75F;
    }
    public void btnMujerOnclick(View view){
        f1=2.25F;
        f2=45F;
    }
    public void btnConfirmaOnclick(View view) {
        TextView lblPi = (TextView) findViewById(R.id.pilbl);
        TextView lblimc = (TextView) findViewById(R.id.imcbl);
        TextView txtpeso = (TextView) findViewById(R.id.Pesotxt);
        TextView txtAltura = (TextView) findViewById(R.id.alturaTxt);

        int peso = Integer.parseInt(txtpeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

       float resultado= peso/ ((altura/100)*2);
        Double pi=((((altura - 152.4)/2.54)*f1)+f2);


        if(resultado< 18){
            lblimc.setText("Debajo del peso normal");

        }else if(resultado>=18.1 && resultado<=24.9){
              lblimc.setText("Peso normal");
        }else if(resultado>=25 && resultado<=29.9){
            lblimc.setText("Sobrepeso");
        }else if(resultado>=30 && resultado<=34.9){
            lblimc.setText("Obesidad de tipo 1");
        }else if(resultado>=35){
            lblimc.setText("Obesidad de tipo II");
        }
        lblPi.setText("Peso ideal de: "+"".valueOf(pi));


    }
}