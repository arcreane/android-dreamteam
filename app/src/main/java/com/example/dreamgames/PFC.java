package com.example.dreamgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PFC extends AppCompatActivity {

    Random random = new Random();
    int scorePlayer;
    int scoreIA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_f_c);
    }

    public void onClick(View v)
    {
        Intent gameActivity = new Intent(PFC.this, MainActivity.class);
        startActivity(gameActivity);
    }

    public void onClick3(View v)
    {
        int PlayerChoice = 1;
        int IAChoice = random.nextInt(3)+1;
        ImageView Image4= (ImageView)findViewById(R.id.image4);
        Image4.setVisibility(View.VISIBLE);
        ImageView Image5= (ImageView)findViewById(R.id.image5);
        Image5.setVisibility(View.INVISIBLE);
        ImageView Image6= (ImageView)findViewById(R.id.image6);
        Image6.setVisibility(View.INVISIBLE);

        if(IAChoice == 1)
        {
            ImageView Image7= (ImageView)findViewById(R.id.image7);
            Image7.setVisibility(View.VISIBLE);
            ImageView Image8= (ImageView)findViewById(R.id.image8);
            Image8.setVisibility(View.INVISIBLE);
            ImageView Image9= (ImageView)findViewById(R.id.image9);
            Image9.setVisibility(View.INVISIBLE);
            TextView textz = (TextView) findViewById(R.id.textz);
            textz.setVisibility(View.VISIBLE);
            TextView texty = (TextView) findViewById(R.id.texty);
            texty.setVisibility(View.VISIBLE);
            TextView textx = (TextView) findViewById(R.id.textx);
            textx.setVisibility(View.VISIBLE);
            TextView textv = (TextView) findViewById(R.id.textv);
            textv.setVisibility(View.INVISIBLE);
            TextView textw = (TextView) findViewById(R.id.textw);
            textw.setVisibility(View.INVISIBLE);
        }

        if(IAChoice == 2)
        {
            ImageView Image7= (ImageView)findViewById(R.id.image7);
            Image7.setVisibility(View.INVISIBLE);
            ImageView Image8= (ImageView)findViewById(R.id.image8);
            Image8.setVisibility(View.VISIBLE);
            ImageView Image9= (ImageView)findViewById(R.id.image9);
            Image9.setVisibility(View.INVISIBLE);
            TextView textz = (TextView) findViewById(R.id.textz);
            textz.setVisibility(View.VISIBLE);
            TextView texty = (TextView) findViewById(R.id.texty);
            texty.setVisibility(View.VISIBLE);
            TextView textx = (TextView) findViewById(R.id.textx);
            textx.setVisibility(View.INVISIBLE);
            TextView textv = (TextView) findViewById(R.id.textv);
            textv.setVisibility(View.INVISIBLE);
            TextView textw = (TextView) findViewById(R.id.textw);
            textw.setVisibility(View.VISIBLE);
        }

        if(IAChoice == 3)
        {
            ImageView Image7= (ImageView)findViewById(R.id.image7);
            Image7.setVisibility(View.INVISIBLE);
            ImageView Image8= (ImageView)findViewById(R.id.image8);
            Image8.setVisibility(View.INVISIBLE);
            ImageView Image9= (ImageView)findViewById(R.id.image9);
            Image9.setVisibility(View.VISIBLE);
            TextView textz = (TextView) findViewById(R.id.textz);
            textz.setVisibility(View.VISIBLE);
            TextView texty = (TextView) findViewById(R.id.texty);
            texty.setVisibility(View.VISIBLE);
            TextView textx = (TextView) findViewById(R.id.textx);
            textx.setVisibility(View.INVISIBLE);
            TextView textv = (TextView) findViewById(R.id.textv);
            textv.setVisibility(View.VISIBLE);
            TextView textw = (TextView) findViewById(R.id.textw);
            textw.setVisibility(View.INVISIBLE);
        }
    }

    public void onClick4(View v)
    {
        int PlayerChoice = 2;
        int IAChoice = random.nextInt(3)+1;
        ImageView Image4= (ImageView)findViewById(R.id.image4);
        Image4.setVisibility(View.INVISIBLE);
        ImageView Image5= (ImageView)findViewById(R.id.image5);
        Image5.setVisibility(View.VISIBLE);
        ImageView Image6= (ImageView)findViewById(R.id.image6);
        Image6.setVisibility(View.INVISIBLE);

        if(IAChoice == 2)
        {
            ImageView Image7= (ImageView)findViewById(R.id.image7);
            Image7.setVisibility(View.INVISIBLE);
            ImageView Image8= (ImageView)findViewById(R.id.image8);
            Image8.setVisibility(View.VISIBLE);
            ImageView Image9= (ImageView)findViewById(R.id.image9);
            Image9.setVisibility(View.INVISIBLE);
            TextView textz = (TextView) findViewById(R.id.textz);
            textz.setVisibility(View.VISIBLE);
            TextView texty = (TextView) findViewById(R.id.texty);
            texty.setVisibility(View.VISIBLE);
            TextView textx = (TextView) findViewById(R.id.textx);
            textx.setVisibility(View.VISIBLE);
            TextView textv = (TextView) findViewById(R.id.textv);
            textv.setVisibility(View.INVISIBLE);
            TextView textw = (TextView) findViewById(R.id.textw);
            textw.setVisibility(View.INVISIBLE);
        }

        if(IAChoice == 3)
        {
            ImageView Image7= (ImageView)findViewById(R.id.image7);
            Image7.setVisibility(View.INVISIBLE);
            ImageView Image8= (ImageView)findViewById(R.id.image8);
            Image8.setVisibility(View.INVISIBLE);
            ImageView Image9= (ImageView)findViewById(R.id.image9);
            Image9.setVisibility(View.VISIBLE);
            TextView textz = (TextView) findViewById(R.id.textz);
            textz.setVisibility(View.VISIBLE);
            TextView texty = (TextView) findViewById(R.id.texty);
            texty.setVisibility(View.VISIBLE);
            TextView textx = (TextView) findViewById(R.id.textx);
            textx.setVisibility(View.INVISIBLE);
            TextView textv = (TextView) findViewById(R.id.textv);
            textv.setVisibility(View.INVISIBLE);
            TextView textw = (TextView) findViewById(R.id.textw);
            textw.setVisibility(View.VISIBLE);
        }

        if(IAChoice == 1)
        {
            ImageView Image7= (ImageView)findViewById(R.id.image7);
            Image7.setVisibility(View.VISIBLE);
            ImageView Image8= (ImageView)findViewById(R.id.image8);
            Image8.setVisibility(View.INVISIBLE);
            ImageView Image9= (ImageView)findViewById(R.id.image9);
            Image9.setVisibility(View.INVISIBLE);
            TextView textz = (TextView) findViewById(R.id.textz);
            textz.setVisibility(View.VISIBLE);
            TextView texty = (TextView) findViewById(R.id.texty);
            texty.setVisibility(View.VISIBLE);
            TextView textx = (TextView) findViewById(R.id.textx);
            textx.setVisibility(View.INVISIBLE);
            TextView textv = (TextView) findViewById(R.id.textv);
            textv.setVisibility(View.VISIBLE);
            TextView textw = (TextView) findViewById(R.id.textw);
            textw.setVisibility(View.INVISIBLE);
        }
    }

    public void onClick5(View v)
    {
        int PlayerChoice = 3;
        int IAChoice = random.nextInt(3)+1;
        ImageView Image4= (ImageView)findViewById(R.id.image4);
        Image4.setVisibility(View.INVISIBLE);
        ImageView Image5= (ImageView)findViewById(R.id.image5);
        Image5.setVisibility(View.INVISIBLE);
        ImageView Image6= (ImageView)findViewById(R.id.image6);
        Image6.setVisibility(View.VISIBLE);

        if(IAChoice == 3)
        {
            ImageView Image7= (ImageView)findViewById(R.id.image7);
            Image7.setVisibility(View.INVISIBLE);
            ImageView Image8= (ImageView)findViewById(R.id.image8);
            Image8.setVisibility(View.INVISIBLE);
            ImageView Image9= (ImageView)findViewById(R.id.image9);
            Image9.setVisibility(View.VISIBLE);
            TextView textz = (TextView) findViewById(R.id.textz);
            textz.setVisibility(View.VISIBLE);
            TextView texty = (TextView) findViewById(R.id.texty);
            texty.setVisibility(View.VISIBLE);
            TextView textx = (TextView) findViewById(R.id.textx);
            textx.setVisibility(View.VISIBLE);
            TextView textv = (TextView) findViewById(R.id.textv);
            textv.setVisibility(View.INVISIBLE);
            TextView textw = (TextView) findViewById(R.id.textw);
            textw.setVisibility(View.INVISIBLE);
        }

        if(IAChoice == 1)
        {
            ImageView Image7= (ImageView)findViewById(R.id.image7);
            Image7.setVisibility(View.VISIBLE);
            ImageView Image8= (ImageView)findViewById(R.id.image8);
            Image8.setVisibility(View.INVISIBLE);
            ImageView Image9= (ImageView)findViewById(R.id.image9);
            Image9.setVisibility(View.INVISIBLE);
            TextView textz = (TextView) findViewById(R.id.textz);
            textz.setVisibility(View.VISIBLE);
            TextView texty = (TextView) findViewById(R.id.texty);
            texty.setVisibility(View.VISIBLE);
            TextView textx = (TextView) findViewById(R.id.textx);
            textx.setVisibility(View.INVISIBLE);
            TextView textv = (TextView) findViewById(R.id.textv);
            textv.setVisibility(View.INVISIBLE);
            TextView textw = (TextView) findViewById(R.id.textw);
            textw.setVisibility(View.VISIBLE);
        }

        if(IAChoice == 2)
        {
            ImageView Image7= (ImageView)findViewById(R.id.image7);
            Image7.setVisibility(View.INVISIBLE);
            ImageView Image8= (ImageView)findViewById(R.id.image8);
            Image8.setVisibility(View.VISIBLE);
            ImageView Image9= (ImageView)findViewById(R.id.image9);
            Image9.setVisibility(View.INVISIBLE);
            TextView textz = (TextView) findViewById(R.id.textz);
            textz.setVisibility(View.VISIBLE);
            TextView texty = (TextView) findViewById(R.id.texty);
            texty.setVisibility(View.VISIBLE);
            TextView textx = (TextView) findViewById(R.id.textx);
            textx.setVisibility(View.INVISIBLE);
            TextView textv = (TextView) findViewById(R.id.textv);
            textv.setVisibility(View.VISIBLE);
            TextView textw = (TextView) findViewById(R.id.textw);
            textw.setVisibility(View.INVISIBLE);
        }
    }
}