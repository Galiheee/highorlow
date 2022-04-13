package com.example.highandlowgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void randomNumberGenerator() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
    }

    public void onGuess(View view) {
        String message;
        try {
            EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
            int GuessedNumber = Integer.parseInt(editTextNumber.getText().toString());
            if (GuessedNumber < 1 || GuessedNumber > 100)
                message = "Input a number between 1-20!";
            else if (GuessedNumber < randomNumber)
                message = "Higher !!";
            else if (GuessedNumber > randomNumber)
                message = "Lower !!";
            else {
                message = "You Got Me !!";
                randomNumberGenerator();
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            message = "Input Number !!";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Random rand = new Random();
            randomNumber = rand.nextInt(100) + 1;
        }
    }
