package com.example.notenrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Note_berechnen extends AppCompatActivity {

    /*
    Intent um die Daten von einer anderen Activity zu holen
    schreibt die Zahlen in eine Variabel und gibt sie als TextView aus
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_berechnen);
        setTitle("Note Berechnen");


        Intent intent_Note = getIntent(); //holte den Intent
        float Max_punkte = intent_Note.getFloatExtra(Note_punkte.EXTRA_MAX_PUNKTE, 0); //befüllt den String mit dem intent
        float Min_punkte = intent_Note.getFloatExtra(Note_punkte.EXTRA_MIN_PUNKTE, 0); //befüllt den int mit dem Intent

        TextView Note_result = (TextView) findViewById(R.id.Note_result); //Verbindet den Textview mit einem Textview

        Note_result.setText("" + ((Min_punkte / Max_punkte) * 5 + 1)); //schreibt die nummer in den View
    }
}