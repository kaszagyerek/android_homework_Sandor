package com.example.activitystatesavetwo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    CheckBox check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edit = findViewById(R.id.editText);
        check = findViewById(R.id.checkBox);
        if (savedInstanceState != null) {
            edit.setText(savedInstanceState.getString("edit"));
            check.setChecked((savedInstanceState.getBoolean("check")));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("edit", edit.getText().toString());
        outState.putBoolean("check", check.isChecked());
    }
}