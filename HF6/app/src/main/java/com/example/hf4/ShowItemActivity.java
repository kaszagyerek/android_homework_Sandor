package com.example.hf4;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class ShowItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.fragment2);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedCurrency = extras.getString("item");
            TextView tv = (TextView) findViewById(R.id.selectedopt);
            tv.setText("You have selected: " + selectedCurrency);
        }
    }
}