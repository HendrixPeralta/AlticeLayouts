package com.example.android.alticelayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class List_View_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__view_);

        ListView listView = (ListView) findViewById(R.id.list_view);

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            stringList.add(Integer.toString(i));
        }

        listView.setAdapter(new ArrayAdapter<>(this,
                R.layout.my_text_view,
                stringList));
    }
}
