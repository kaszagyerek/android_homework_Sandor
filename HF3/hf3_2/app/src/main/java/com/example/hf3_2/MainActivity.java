package com.example.hf3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText pcode = findViewById(R.id.pcode);
        EditText pname = findViewById(R.id.pname);
        EditText pprice = findViewById(R.id.pprice);

        Button add = findViewById(R.id.add);
        Button cancel = findViewById(R.id.cancel);
        Button show = findViewById(R.id.show);

        ArrayList<Product> lista = new ArrayList<>();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int code = Integer.parseInt(pcode.getText().toString());
                String name = pname.getText().toString();
                int price = Integer.parseInt(pprice.getText().toString());

                lista.add(new Product(code, name, price));
            }
        });

        cancel.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                pcode.setText("");
                pname.setText("");
                pprice.setText("");
            }
        });
        TextView res = findViewById(R.id.res);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder added = new StringBuilder();
                for (Product e : lista){
                    added.append(e.toString());
                }
                res.setText(added.toString());
            }
        });

    }
}