package com.example.dreamgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();
    int scorePlayer;
    int scoreIA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick3(View v)
    {
        int PlayerChoice = 1;
        int IAChoice = random.nextInt(3)+1;
        TextView textViewd = (TextView) findViewById(R.id.editTextd);
        textViewd.setText("X");
        TextView textViewe = (TextView) findViewById(R.id.editTexte);
        textViewe.setText("");
        TextView textViewf = (TextView) findViewById(R.id.editTextf);
        textViewf.setText("");

        if(IAChoice == 1)
        {
            TextView textView = (TextView) findViewById(R.id.editText2);
            textView.setText("0");
            TextView textView2 = (TextView) findViewById(R.id.editText3);
            textView2.setText("0");
            TextView textView3 = (TextView) findViewById(R.id.editText4);
            textView3.setText("EGALITE");
            TextView textViewa = (TextView) findViewById(R.id.editTexta);
            textViewa.setText("X");
            TextView textViewb = (TextView) findViewById(R.id.editTextb);
            textViewb.setText("");
            TextView textViewc = (TextView) findViewById(R.id.editTextc);
            textViewc.setText("");
        }

        if(IAChoice == 2)
        {
            TextView textView = (TextView) findViewById(R.id.editText2);
            textView.setText("0");
            TextView textView2 = (TextView) findViewById(R.id.editText3);
            textView2.setText("1");
            TextView textView3 = (TextView) findViewById(R.id.editText4);
            textView3.setText("PERDU");
            TextView textViewa = (TextView) findViewById(R.id.editTexta);
            textViewa.setText("");
            TextView textViewb = (TextView) findViewById(R.id.editTextb);
            textViewb.setText("X");
            TextView textViewc = (TextView) findViewById(R.id.editTextc);
            textViewc.setText("");
        }

        if(IAChoice == 3)
        {
            TextView textView = (TextView) findViewById(R.id.editText2);
            textView.setText("1");
            TextView textView2 = (TextView) findViewById(R.id.editText3);
            textView2.setText("0");
            TextView textView3 = (TextView) findViewById(R.id.editText4);
            textView3.setText("GAGNE");
            TextView textViewa = (TextView) findViewById(R.id.editTexta);
            textViewa.setText("");
            TextView textViewb = (TextView) findViewById(R.id.editTextb);
            textViewb.setText("");
            TextView textViewc = (TextView) findViewById(R.id.editTextc);
            textViewc.setText("X");
        }
    }

    public void onClick4(View v)
    {
        int PlayerChoice = 2;
        int IAChoice = random.nextInt(3)+1;
        TextView textViewd = (TextView) findViewById(R.id.editTextd);
        textViewd.setText("");
        TextView textViewe = (TextView) findViewById(R.id.editTexte);
        textViewe.setText("X");
        TextView textViewf = (TextView) findViewById(R.id.editTextf);
        textViewf.setText("");

        if(IAChoice == 2)
        {
            TextView textView = (TextView) findViewById(R.id.editText2);
            textView.setText("0");
            TextView textView2 = (TextView) findViewById(R.id.editText3);
            textView2.setText("0");
            TextView textView3 = (TextView) findViewById(R.id.editText4);
            textView3.setText("EGALITE");
            TextView textViewa = (TextView) findViewById(R.id.editTexta);
            textViewa.setText("");
            TextView textViewb = (TextView) findViewById(R.id.editTextb);
            textViewb.setText("X");
            TextView textViewc = (TextView) findViewById(R.id.editTextc);
            textViewc.setText("");
        }

        if(IAChoice == 3)
        {
            TextView textView = (TextView) findViewById(R.id.editText2);
            textView.setText("0");
            TextView textView2 = (TextView) findViewById(R.id.editText3);
            textView2.setText("1");
            TextView textView3 = (TextView) findViewById(R.id.editText4);
            textView3.setText("PERDU");
            TextView textViewa = (TextView) findViewById(R.id.editTexta);
            textViewa.setText("");
            TextView textViewb = (TextView) findViewById(R.id.editTextb);
            textViewb.setText("");
            TextView textViewc = (TextView) findViewById(R.id.editTextc);
            textViewc.setText("X");
        }

        if(IAChoice == 1)
        {
            TextView textView = (TextView) findViewById(R.id.editText2);
            textView.setText("1");
            TextView textView2 = (TextView) findViewById(R.id.editText3);
            textView2.setText("0");
            TextView textView3 = (TextView) findViewById(R.id.editText4);
            textView3.setText("GAGNE");
            TextView textViewa = (TextView) findViewById(R.id.editTexta);
            textViewa.setText("X");
            TextView textViewb = (TextView) findViewById(R.id.editTextb);
            textViewb.setText("");
            TextView textViewc = (TextView) findViewById(R.id.editTextc);
            textViewc.setText("");
        }
    }

    public void onClick5(View v)
    {
        int PlayerChoice = 3;
        int IAChoice = random.nextInt(3)+1;
        TextView textViewd = (TextView) findViewById(R.id.editTextd);
        textViewd.setText("");
        TextView textViewe = (TextView) findViewById(R.id.editTexte);
        textViewe.setText("");
        TextView textViewf = (TextView) findViewById(R.id.editTextf);
        textViewf.setText("X");

        if(IAChoice == 3)
        {
            TextView textView = (TextView) findViewById(R.id.editText2);
            textView.setText("0");
            TextView textView2 = (TextView) findViewById(R.id.editText3);
            textView2.setText("0");
            TextView textView3 = (TextView) findViewById(R.id.editText4);
            textView3.setText("EGALITE");
            TextView textViewa = (TextView) findViewById(R.id.editTexta);
            textViewa.setText("");
            TextView textViewb = (TextView) findViewById(R.id.editTextb);
            textViewb.setText("");
            TextView textViewc = (TextView) findViewById(R.id.editTextc);
            textViewc.setText("X");
        }

        if(IAChoice == 1)
        {
            TextView textView = (TextView) findViewById(R.id.editText2);
            textView.setText("0");
            TextView textView2 = (TextView) findViewById(R.id.editText3);
            textView2.setText("1");
            TextView textView3 = (TextView) findViewById(R.id.editText4);
            textView3.setText("PERDU");
            TextView textViewa = (TextView) findViewById(R.id.editTexta);
            textViewa.setText("X");
            TextView textViewb = (TextView) findViewById(R.id.editTextb);
            textViewb.setText("");
            TextView textViewc = (TextView) findViewById(R.id.editTextc);
            textViewc.setText("");
        }

        if(IAChoice == 2)
        {
            TextView textView = (TextView) findViewById(R.id.editText2);
            textView.setText("1");
            TextView textView2 = (TextView) findViewById(R.id.editText3);
            textView2.setText("0");
            TextView textView3 = (TextView) findViewById(R.id.editText4);
            textView3.setText("GAGNE");
            TextView textViewa = (TextView) findViewById(R.id.editTexta);
            textViewa.setText("");
            TextView textViewb = (TextView) findViewById(R.id.editTextb);
            textViewb.setText("X");
            TextView textViewc = (TextView) findViewById(R.id.editTextc);
            textViewc.setText("");
        }
    }
}