package com.example.dreamgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Morpion extends AppCompatActivity {

    Button pion0, pion1, pion2, pion3, pion4, pion5, pion6, pion7, pion8;

    TextView gameStatus;
    Button ResetButton;
    ImageView morpionImgView;
    boolean Over = false;
    int currentTurn = 0;
    String joueurs[] = {"X", "O"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morpion);

        Initialiser();

        EventListener();

    }

    private void EventListener() {
        pion0.setOnClickListener(pionListener);
        pion1.setOnClickListener(pionListener);
        pion2.setOnClickListener(pionListener);
        pion3.setOnClickListener(pionListener);
        pion4.setOnClickListener(pionListener);
        pion5.setOnClickListener(pionListener);
        pion6.setOnClickListener(pionListener);
        pion7.setOnClickListener(pionListener);
        pion8.setOnClickListener(pionListener);

        ResetButton.setOnClickListener(ResetListener);
    }

    private View.OnClickListener pionListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            //Trouver le bouton sur lequel on a cliqué
            Button button = (Button) findViewById(v.getId());

            //Est ce que le jeu est terminé
            if(Over)
            {
                return;
            }

            //Vérifier si emplacement valide
            if(!Valid(button))
            {
                //Shake Animation
                gameStatus.setText("Déplacement invalide!");
            }
            else
            {
                setSymbol(button, joueurs[currentTurn]);

                Over = winnerExists();

                if(Over)
                {
                    gameStatus.setText("Le joueur "+joueurs[currentTurn]+ " a gagné!");
                    return;
                }
                if(boardIsFull())
                {
                    gameStatus.setText("MATCH NUL!");
                    Over = true;
                    return;
                }
                currentTurn = currentTurn == 0 ? 1 : 0;

                gameStatus.setText("Le joueur "+joueurs[currentTurn]+ " , c'est à toi de jouer!");
            }

        }

    };

    private boolean winnerExists()
    {
        if(pion0.getText().toString() == joueurs[currentTurn]
                && pion1.getText().toString() == joueurs[currentTurn]
                && pion2.getText().toString() == joueurs[currentTurn])
        {
            return true;
        }

        if(pion3.getText().toString() == joueurs[currentTurn]
                && pion4.getText().toString() == joueurs[currentTurn]
                && pion5.getText().toString() == joueurs[currentTurn])
        {
            return true;
        }

        if(pion6.getText().toString() == joueurs[currentTurn]
                && pion7.getText().toString() == joueurs[currentTurn]
                && pion8.getText().toString() == joueurs[currentTurn])
        {
            return true;
        }

        if(pion0.getText().toString() == joueurs[currentTurn]
                && pion3.getText().toString() == joueurs[currentTurn]
                && pion6.getText().toString() == joueurs[currentTurn])
        {
            return true;
        }

        if(pion1.getText().toString() == joueurs[currentTurn]
                && pion4.getText().toString() == joueurs[currentTurn]
                && pion7.getText().toString() == joueurs[currentTurn])
        {
            return true;
        }

        if(pion2.getText().toString() == joueurs[currentTurn]
                && pion5.getText().toString() == joueurs[currentTurn]
                && pion8.getText().toString() == joueurs[currentTurn])
        {
            return true;
        }

        if(pion0.getText().toString() == joueurs[currentTurn]
                && pion4.getText().toString() == joueurs[currentTurn]
                && pion8.getText().toString() == joueurs[currentTurn])
        {
            return true;
        }

        if(pion2.getText().toString() == joueurs[currentTurn]
                && pion4.getText().toString() == joueurs[currentTurn]
                && pion6.getText().toString() == joueurs[currentTurn])
        {
            return true;
        }
        return false;
    }

    private void changeColors(int i, int i1, int i2)
    {
    }

    private boolean boardIsFull()
    {
        if((Valid(pion0))
                || (Valid(pion1))
                || (Valid(pion2))
                || (Valid(pion3))
                || (Valid(pion4))
                || (Valid(pion5))
                || (Valid(pion6))
                || (Valid(pion7))
                || (Valid(pion8)))
        {
            return false;
        }
        return true;
    }

    private void setSymbol(Button button, String symbol)
    {
        button.setText(symbol);
    }

    private View.OnClickListener ResetListener = new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            pion0.setText("");
            pion0.setTextColor(Color.BLACK);
            pion1.setText("");
            pion1.setTextColor(Color.BLACK);
            pion2.setText("");
            pion2.setTextColor(Color.BLACK);
            pion3.setText("");
            pion3.setTextColor(Color.BLACK);
            pion4.setText("");
            pion4.setTextColor(Color.BLACK);
            pion5.setText("");
            pion5.setTextColor(Color.BLACK);
            pion6.setText("");
            pion6.setTextColor(Color.BLACK);
            pion7.setText("");
            pion7.setTextColor(Color.BLACK);
            pion8.setText("");
            pion8.setTextColor(Color.BLACK);

            gameStatus.setText(R.string.text);
            currentTurn = 0;
            Over = false;
        }
    };

    private void Initialiser() {
        pion0 = findViewById(R.id.pion0);
        pion1 = findViewById(R.id.pion1);
        pion2 = findViewById(R.id.pion2);
        pion3 = findViewById(R.id.pion3);
        pion4 = findViewById(R.id.pion4);
        pion5 = findViewById(R.id.pion5);
        pion6 = findViewById(R.id.pion6);
        pion7 = findViewById(R.id.pion7);
        pion8 = findViewById(R.id.pion8);

        gameStatus = (TextView) findViewById(R.id.text6);

        ResetButton = (Button) findViewById(R.id.button6);

        morpionImgView = findViewById(R.id.imageView);
    }

    private boolean Valid(Button button)
    {
        return button.getText().toString().length() == 0;
    }

    public void onClick(View v)
    {
        Intent gameActivity = new Intent(Morpion.this, MainActivity.class);
        startActivity(gameActivity);
    }
}