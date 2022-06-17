package com.example.notenrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Note_punkte extends AppCompatActivity {
    public static final String EXTRA_MAX_PUNKTE = "com.example.test.EXTRA_TEXT"; //eine Konstante
    public static final String EXTRA_MIN_PUNKTE = "com.example.test.EXTRA_NUMBER"; //eine Konstante

    /*
    Einen Onclick listener der zur Noten_berechnen Klasse verweist
    Methode OpenNote
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_punkte);
        setTitle("Punkte Eingabe");

        Button open_note_berechnen =(Button) findViewById(R.id.open_note_berechnen); //castet den Button mit einen neuen Button hier
        open_note_berechnen.setOnClickListener(new View.OnClickListener() { //neuer Onclicklistener
            @Override
            public void onClick(View view) {
                openNote(); //methode anwenden

            }
        });
    }

    /*
    metode um andere Activity zu öffnen
    Regeln für die Textfelder
    Ist für das Übertragen der Textfelder benötigt
     */
    public void  openNote() { //methode um activity zu wechseln

        EditText Max_punkte = (EditText) findViewById(R.id.Max_punkte); //verbindete den Edittext mit einem edittext hier
        EditText Min_punkte = (EditText) findViewById(R.id.Min_punkte); //verbindete den Edittext mit einem edittext hier


        if (Max_punkte.getText().toString().equals("") //if bedingung, wenn das Zahlen Feld leer ist wird eine Nachricht (toast) angezeigt
                || Min_punkte.getText().toString().equals("")){
            Toast.makeText(Note_punkte.this, "Bitte Punkte eingeben", Toast.LENGTH_SHORT).show(); //toast erstellen
        }
        else { //Falls etwas eingegeben wird, wird das else ausgeführt
            float punkte_1 = Float.parseFloat(Max_punkte.getText().toString()); //schreibt den Edittext in einen String und dann in einen INT
            float punkte_2 = Float.parseFloat(Min_punkte.getText().toString()); //schreibt den Edittext in einen String und dann in einen INT

            Intent intent_Note = new Intent(this, Note_berechnen.class); //neuer Intent
            intent_Note.putExtra(EXTRA_MAX_PUNKTE, punkte_1); //befüllt den intent mit der nummer
            intent_Note.putExtra(EXTRA_MIN_PUNKTE, punkte_2); //befüllt den intent mit der nummer
            startActivity(intent_Note); //startet die zweite Activity
        }
    }
}