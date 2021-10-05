package com.example.moviedb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView showJson = (ImageView) findViewById(R.id.json);
        ImageView showJsonAPI = (ImageView) findViewById(R.id.json_api);
        ImageView showMovieDb = (ImageView) findViewById(R.id.moviedb);

        showJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, JsonParseActivity.class);
                startActivity(intent);
            }
        });
        showJsonAPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, JsonAPIActivity.class);
                startActivity(intent);
            }
        });
        showMovieDb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MovieDBActivity.class);
                startActivity(intent);
            }
        });
    }
}