package com.gemaadhan.snippetandroidcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<City> city =  new ArrayList<City>();
        city.add(new City(7.7, "TokyoTokyoTokyoTokyoTokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));
        city.add(new City(7.7, "Tokyo",1515196780));




        CityAdapter adapter = new CityAdapter(this, city);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, city);
        ListView cityListView = (ListView) findViewById(R.id.list);
        cityListView.setAdapter(adapter);

    }
}
