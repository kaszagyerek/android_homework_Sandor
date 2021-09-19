package com.example.hazi1kaszas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView eredmeny = findViewById(R.id.textView3);
        EditText bevitel1 = findViewById(R.id.editTextTextPersonName);
        EditText bevitel2 = findViewById(R.id.editTextTextPersonName2);
        Button osszeadas = findViewById(R.id.button);
        Button kivonas = findViewById(R.id.button2);
        Button szorzas = findViewById(R.id.button3);
        Button osztas = findViewById(R.id.button4);
        String felugrik= "Hiba van agyon meg egész számot";
        String felugrik2= "Hiba van 0 val nem lehet osztani/szorozni";


        osszeadas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        double v1 = Double.parseDouble(bevitel1.getText().toString()) + Double.parseDouble(bevitel2.getText().toString());

                        eredmeny.setText(Double.toString(v1));


                    }
                    catch (Exception e){
                        eredmeny.setText("");

                        Toast.makeText(MainActivity.this , felugrik.toString(), Toast.LENGTH_LONG).show();
                    }

                }
            });
            kivonas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        double v1 = Double.parseDouble(bevitel1.getText().toString()) - Double.parseDouble(bevitel2.getText().toString());

                        eredmeny.setText(Double.toString(v1));
                    } catch (Exception e){
                        eredmeny.setText("");
                        Toast.makeText(MainActivity.this , felugrik.toString(), Toast.LENGTH_LONG).show();

                    }
                }
            });

            szorzas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        double v1 = Double.parseDouble(bevitel1.getText().toString()) * Double.parseDouble(bevitel2.getText().toString());
                        eredmeny.setText(Double.toString(v1));
                    }



                    catch (Exception e){
                        if (bevitel1.getText().toString().startsWith("0") || bevitel2.getText().toString().startsWith("0")) {
                            eredmeny.setText("");
                            Toast.makeText(MainActivity.this, felugrik2.toString(), Toast.LENGTH_LONG).show();
                        }

                        eredmeny.setText("");
                        Toast.makeText(MainActivity.this , felugrik.toString(), Toast.LENGTH_LONG).show();

                    }

                }
            });

            osztas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        double v1 = Double.parseDouble(bevitel1.getText().toString()) / Double.parseDouble(bevitel2.getText().toString());
                        eredmeny.setText(Double.toString(v1));
                    }

                    catch (Exception e){
                        if (bevitel1.getText().toString().startsWith("0") || bevitel2.getText().toString().startsWith("0")) {
                            eredmeny.setText("");
                            Toast.makeText(MainActivity.this, felugrik2.toString(), Toast.LENGTH_LONG).show();
                        }
                        eredmeny.setText("");
                        Toast.makeText(MainActivity.this , felugrik.toString(), Toast.LENGTH_LONG).show();

                    }

                }
            });



    }
}