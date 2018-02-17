package com.example.android.alticelayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myLinearLayoutHorizontal = (Button)
                findViewById(R.id.myLinearLayoutHorizontal);
        Button myLinearLayoutVertical = (Button)
                findViewById(R.id.myLinearLayoutVertical);
        Button myRelativeLayout = (Button)
                findViewById(R.id.relative_layout);
        Button myTableLayout = (Button)
                findViewById(R.id.table_layout);
        Button myFrameLayout = (Button)
                findViewById(R.id.frame_layout);
        Button myListViewLayout = (Button)
                findViewById(R.id.list_view);
        Button myGridLayout = (Button)
                findViewById(R.id.grid_view);

        myLinearLayoutHorizontal.setOnClickListener(this);
        myLinearLayoutVertical.setOnClickListener(this);
        myRelativeLayout.setOnClickListener(this);
        myTableLayout.setOnClickListener(this);
        myFrameLayout.setOnClickListener(this);
        myListViewLayout.setOnClickListener(this);
        myGridLayout.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Cualquier mensaje", Toast.LENGTH_SHORT);
        switch (view.getId()){
            case R.id.myLinearLayoutHorizontal:
                Log.d("MainActivity", "Horizontal clicked");
                Intent intent = new Intent(this, linearLayoutHorizontal.class);
                startActivity(intent);
            break;

            case R.id.myLinearLayoutVertical:
                Log.d("MainActivity", "Vertical clicked");
                Intent intent2 = new Intent(this, linearLayoutVertical.class);
                startActivity(intent2);
            break;

            case R.id.relative_layout:
                Log.d("MainActivity", "Vertical clicked");
                Intent intent3 = new Intent(this, Relative_Layout.class);
                startActivity(intent3);
                break;

            case R.id.table_layout:
                Log.d("MainActivity", "Vertical clicked");
                Intent intent4 = new Intent(this, tableLayout.class);
                startActivity(intent4);
                break;

            case R.id.frame_layout:
                Log.d("MainActivity", "Vertical clicked");
                Intent intent5 = new Intent(this, Frame_Layout.class);
                startActivity(intent5);
                break;

            case R.id.list_view:
                Log.d("MainActivity", "Vertical clicked");
                Intent intent6 = new Intent(this, List_View_Activity.class);
                startActivity(intent6);
                break;

            case R.id.grid_view:
                Log.d("MainActivity", "Vertical clicked");
                Intent intent7 = new Intent(this, Grid_View.class);
                startActivity(intent7);
                break;

            default:
                Log.d("MainActivity", "Ni idea");
                break;

        }
    }
}
