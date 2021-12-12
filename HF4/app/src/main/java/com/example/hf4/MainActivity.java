package com.example.hf4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvContacts = findViewById(R.id.rvContacts);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
        List<Adatok> contacts = Adatok.getContacts();
        AdatoAdapter adapter = new AdatoAdapter(this,contacts);
    }
}