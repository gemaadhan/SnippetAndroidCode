package com.gemaadhan.snippetandroidcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Gempa> gempa = QueryUtils.extractEarthquakes();
        GempaAdapter adapter = new GempaAdapter(this, gempa);
        ListView cityListView = (ListView) findViewById(R.id.list);
        cityListView.setAdapter(adapter);

    }
}
