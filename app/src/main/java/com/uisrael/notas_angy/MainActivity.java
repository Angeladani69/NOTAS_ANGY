package com.uisrael.notas_angy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt1, txt2, txt3, txt4, txt5, txt6, txt7, txtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.txtValor1);
        txt2 = findViewById(R.id.txtValor2);
        txt3 = findViewById(R.id.txtValor3);
        txt4 = findViewById(R.id.txtValor4);
        txt5 = findViewById(R.id.txtValor5);
        txt6 = findViewById(R.id.txtValor6);
        txt7 = findViewById(R.id.txtValor7);
        txtC = findViewById(R.id.txtValor8);
    }

    public void calcularNota(View v){
        double valor1, valor2, valor3, valor4, valor7, te1, te2, te3, te4, te5, te6;
        String c;

        valor1 = Double.parseDouble(txt1.getText().toString());
        valor2 = Double.parseDouble(txt2.getText().toString());
        valor3 = Double.parseDouble(txt3.getText().toString());
        valor4 = Double.parseDouble(txt4.getText().toString());

        te1 = valor1 * (0.3);
        te2 = valor2 * (0.2);
        te3 = te1 + te2;

        te4 = valor3 * (0.3);
        te5 = valor4 * (0.2);
        te6 = te4 + te5;

        valor7 = te3 + te6;

        txt5.setText(Double.toString(te3));
        txt6.setText(Double.toString(te6));

        txt7.setText(Double.toString(valor7));

        if(valor7 >= 7){
            txtC.setText("Aprobado");
        } else {
            txtC.setText("Reprobado");
        }

    }
}

