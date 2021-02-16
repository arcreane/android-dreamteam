package com.example.dreamgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick2(View v)
    {
        Intent gameActivity = new Intent(MainActivity.this, Morpion.class);
        startActivity(gameActivity);
    }

    public void onClick1(View v)
    {
        Intent gameActivity = new Intent(MainActivity.this, PFC.class);
        startActivity(gameActivity);
    }
}