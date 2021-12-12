package com.example.hff7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal("macska", R.drawable.cat, "Macska leiras"));
        animalList.add(new Animal("malacka", R.drawable.disznyo, "Malacka leiras"));
        animalList.add(new Animal("kutya", R.drawable.dog, "Kutya leiras"));
        animalList.add(new Animal("zsiraf", R.drawable.giraffe, "Zsiraf leiras"));
        animalList.add(new Animal("lo", R.drawable.horse, "Lo leiras"));
        animalList.add(new Animal("oroszlan", R.drawable.lion, "Oroszlan leiras"));
        animalList.add(new Animal("nyul", R.drawable.rabbit, "Nyul leiras"));
        animalList.add(new Animal("barany", R.drawable.sheep, "Barany leiras"));
        animalList.add(new Animal("polip", R.drawable.octopus3, "Polip leiras"));

        RecyclerView rvAnimals = findViewById(R.id.rvAnimals);
        rvAnimals.setHasFixedSize(true);
        rvAnimals.setLayoutManager(new LinearLayoutManager(this));
        AnimalsAdapter adapter = new AnimalsAdapter(this, animalList);
        rvAnimals.setAdapter(adapter);
    }
}