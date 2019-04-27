package com.example.overflowmenu33;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // NB called when any overflow menu item selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);

        ConstraintLayout main_view = (ConstraintLayout) findViewById(R.id.main_view_layout);     // get reference to background (pre changing its colour)
        // this ought to have been a RelativeLayout but I forgot and was too lazy to change this (TODO)

        switch(item.getItemId())
        {
            case R.id.menu_red:
//                if (item.isChecked())
//                {
//                    item.setChecked(false);
//                }
//                else
//                {
//                    item.setChecked(true);
//                }
                item.setChecked(!item.isChecked());
                main_view.setBackgroundColor(Color.RED);
                return true;
            case R.id.menu_green:
                item.setChecked(!item.isChecked());
                main_view.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menu_blue:
                item.setChecked(!item.isChecked());
                main_view.setBackgroundColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);       // from boilerplate
        }
    }
}
