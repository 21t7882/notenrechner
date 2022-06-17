package com.example.notenrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Durchschnitt_berechnen extends AppCompatActivity {

    /*
    Holt mit Intent die Zahlen aus der anderen Activity
    Macht ein Textview welches die Zahlen anzeigt
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durchschnitt_berechnen);
        setTitle("Durchschnitt Berechnen"); //setzt den Titel


        Intent intent_durchschnitt = getIntent(); //holte den Intent
        float note_1 = intent_durchschnitt.getFloatExtra(Durchschnitt_Noten.EXTRA_NOTE1, 0);
        float note_2 = intent_durchschnitt.getFloatExtra(Durchschnitt_Noten.EXTRA_NOTE2, 0); //befüllt den int mit dem Intent

        TextView durchschnitt_result = (TextView) findViewById(R.id.durchschnitt_result); //Verbindet den Textview mit einem Textview

        durchschnitt_result.setText("" + ((note_1 + note_2) / 2)); //schreibt die nummer in den View
    }
}