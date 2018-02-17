package com.example.android.alticelayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class Grid_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid__view);
        GridView gridView = (GridView) findViewById(R.id.grid_view);

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            stringList.add(Integer.toString(i));
        }

        gridView.setAdapter(new ArrayAdapter<>(this,
                R.layout.my_text_view,
                stringList));
    }
}
