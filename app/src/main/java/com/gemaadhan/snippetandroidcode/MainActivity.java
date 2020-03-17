package com.gemaadhan.snippetandroidcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> city =  new ArrayList<>();
        city.add("Tokyo");
        city.add("Beijing");
        city.add("San Francisco");
        city.add("Milan");
        city.add("Paris");
        city.add("London");
        city.add("Liverpool");
        city.add("Manchester");
        city.add("New Dheli");
        city.add("Manila");

        ListView cityListView = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, city);
        cityListView.setAdapter(adapter);
    }
}
