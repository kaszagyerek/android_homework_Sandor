package com.example.hf4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String FRAG1 = "1";
    private static final String FRAG2 = "2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
        } else {
            if (fm.findFragmentByTag(FRAG2) != null)
                ft.remove(fm.findFragmentByTag(FRAG2));
        }
        ft.commit();
    }
}