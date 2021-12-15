package com.example.khf5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ArrayList<String> nevek = new ArrayList<>();
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nevek.add("Sandor");
        nevek.add("Geza");
        nevek.add("Imre");
        nevek.add("Janos");
        nevek.add("Molnar");
        nevek.add("Erika");
        nevek.add("Anna");
        nevek.add("Juliska");


        list = findViewById(R.id.list);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nevek);
        registerForContextMenu(list);
        list.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.contex, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.sort )
        {
            Collections.sort(nevek, String.CASE_INSENSITIVE_ORDER);
            adapter.notifyDataSetChanged();
            Toast.makeText(MainActivity.this, "kilistázva", Toast.LENGTH_SHORT).show();
            return true;
        } else  if (item.getItemId() == R.id.delete )
        {
            nevek.clear();
            adapter.notifyDataSetChanged();
            Toast.makeText(MainActivity.this, "törölve", Toast.LENGTH_SHORT).show();
            return true;
        } else  {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        View v = info.targetView;
        TextView view = (TextView) v.findViewById(android.R.id.text1);

        if (item.getItemId() == R.id.red )
        {
            view.setTextColor(Color.RED);
            Toast.makeText(MainActivity.this, "változik pirosra", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId() == R.id.green )
        {
            view.setTextColor(Color.GREEN);
            Toast.makeText(MainActivity.this, "változik zöldre", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.yellow )
        {
            view.setTextColor(Color.YELLOW);
            Toast.makeText(MainActivity.this, "változik sárgára", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onContextItemSelected(item);
        }


        }
    }
