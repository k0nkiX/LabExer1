package com.sanchez.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void Places(View view) {

        Intent i = null;
        if(view.getId() == R.id.Places) {
            i = new Intent(this, Places.class);
            startActivity(i);
        }
    }
        public void Catalog(View view) {
        Intent intent = null;
        intent = new Intent(this, catalog2.class);
        startActivity(intent);

        }


    }

