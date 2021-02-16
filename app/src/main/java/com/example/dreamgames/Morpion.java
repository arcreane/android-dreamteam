package com.example.dreamgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Morpion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morpion);
    }

    public void onClick(View v)
    {
        Intent gameActivity = new Intent(Morpion.this, MainActivity.class);
        startActivity(gameActivity);
    }
}