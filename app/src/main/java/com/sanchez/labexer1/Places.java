package com.sanchez.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
    }

    public void Place1(View view) {
        Intent i = null;
        if (view.getId() == R.id.button1) {
            i = new Intent(this, Place1.class);
            startActivity(i);
        }
    }
    public void Place2(View view) {
        Intent i = null;
        if (view.getId() == R.id.button2) {
            i = new Intent(this, Place2.class);
            startActivity(i);
        }
    }
    public void Place3(View view) {
        Intent i = null;
        if (view.getId() == R.id.button3) {
            i = new Intent(this, Place3.class);
            startActivity(i);
        }
    }
    public void Place4(View view) {
        Intent i = null;
        if (view.getId() == R.id.button4) {
            i = new Intent(this, Place4.class);
            startActivity(i);
        }
    }
    public void back(View view) {
        Intent i = null;
        if (view.getId() == R.id.back) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
