package com.example.sasl03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv1=findViewById(R.id.textView);
        final EditText et1=findViewById(R.id.ANGKA1);
        final EditText et2=findViewById(R.id.ANGKA2);
        final Button bttambah=findViewById(R.id.button1);
        final Button btkurang=findViewById(R.id.button2);
        final Button btkali=findViewById(R.id.button3);
        final Button btbagi=findViewById(R.id.button4);

        bttambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah="";
                if (view.getId() == bttambah.getId()) {
                    Double x1 = Double.parseDouble(et1.getText().toString());
                    Double x2 = Double.parseDouble(et2.getText().toString());
                    Double hasil = x1 + x2;
                    jumlah = Double.toString(hasil);
                    tv1.setText(jumlah);
                }

            }
        });

        btkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah="";
                if (view.getId() == btkurang.getId()) {
                    Double x1 = Double.parseDouble(et1.getText().toString());
                    Double x2 = Double.parseDouble(et2.getText().toString());
                    Double hasil = x1 - x2;
                    jumlah = Double.toString(hasil);
                    tv1.setText(jumlah);
                }

            }
        });

        btkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah="";
                if (view.getId() == btkali.getId()) {
                    Double x1 = Double.parseDouble(et1.getText().toString());
                    Double x2 = Double.parseDouble(et2.getText().toString());
                    Double hasil = x1 * x2;
                    jumlah = Double.toString(hasil);
                    tv1.setText(jumlah);
                }
            }
        });

        btbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah="";
                if (view.getId() == btbagi.getId()) {
                    Double x1 = Double.parseDouble(et1.getText().toString());
                    Double x2 = Double.parseDouble(et2.getText().toString());
                    Double hasil = x1 / x2;
                    jumlah = Double.toString(hasil);
                    tv1.setText(jumlah);
                }
            }
        });


    }
}