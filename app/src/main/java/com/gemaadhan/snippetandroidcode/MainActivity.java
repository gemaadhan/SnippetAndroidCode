package com.gemaadhan.snippetandroidcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Gempa> gempa = QueryUtils.extractEarthquakes();
        final GempaAdapter adapter = new GempaAdapter(this, gempa);
        ListView gempaListView = (ListView) findViewById(R.id.list);
        gempaListView.setAdapter(adapter);
        gempaListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Gempa currentGempa = adapter.getItem(position);
                Uri gempauri = Uri.parse(currentGempa.getmUrl());
                Intent webIntent  = new Intent(Intent.ACTION_VIEW, gempauri);
                startActivity(webIntent);
            }
        });


    }
}
