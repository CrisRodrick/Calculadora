package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inflar vista
       setContentView(R.layout.activity_main);

        //recibir datos desde layout
        EditText txt1 = findViewById(R.id.valor1);
        EditText txt2 = findViewById(R.id.valor2);
        TextView txt3 = findViewById(R.id.resultado);
        Button btn1 = findViewById(R.id.suma);
        Button btn2 = findViewById(R.id.resta);
        Button btn3 = findViewById(R.id.multip);
        Button btn4 = findViewById(R.id.division);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String num1 = txt1.getText().toString();
                    String num2 = txt2.getText().toString();

                    if(txt1.getText().toString().isEmpty() || txt2.getText().toString().isEmpty())
                    {
                        Toast mensaje = Toast.makeText(getApplicationContext(),"INGRESE TODOS LOS VALORES",Toast.LENGTH_LONG);
                        mensaje.show ();

                    }

                    int resul = Integer.parseInt(num1)+ Integer.parseInt(num2);
                    txt3.setText("El resultado es :"+ resul);
                    txt1.setText("");
                    txt2.setText("");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = txt1.getText().toString();
                String num2 = txt2.getText().toString();

                if(txt1.getText().toString().isEmpty() || txt2.getText().toString().isEmpty())
                {
                    Toast mensaje = Toast.makeText(getApplicationContext(),"INGRESE TODOS LOS VALORES", Toast.LENGTH_LONG);
                    mensaje.show();

                }

                int resul = Integer.parseInt(num1)- Integer.parseInt(num2);
                txt3.setText("El resultado es :"+ resul);
                txt1.setText("");
                txt2.setText("");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = txt1.getText().toString();
                String num2 = txt2.getText().toString();

                if(txt1.getText().toString().isEmpty() || txt2.getText().toString().isEmpty())
                {
                    Toast mensaje = Toast.makeText(getApplicationContext(),"INGRESE TODOS LOS VALORES", Toast.LENGTH_LONG);
                    mensaje.show();

                }

                int resul = Integer.parseInt(num1)* Integer.parseInt(num2);
                txt3.setText("El resultado es :"+ resul);
                txt1.setText("");
                txt2.setText("");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = txt1.getText().toString();
                String num2 = txt2.getText().toString();

                if(txt1.getText().toString().isEmpty() || txt2.getText().toString().isEmpty())
                {
                    Toast mensaje = Toast.makeText(getApplicationContext(),"INGRESE TODOS LOS VALORES", Toast.LENGTH_LONG);
                    mensaje.show();

                }

                int resul = Integer.parseInt(num1)/ Integer.parseInt(num2);
                txt3.setText("El resultado es :"+ resul);
                txt1.setText("");
                txt2.setText("");
            }
        });

    }
}