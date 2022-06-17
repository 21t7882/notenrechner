package com.example.notenrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Durchschnitt_Noten extends AppCompatActivity {
    public static final String EXTRA_NOTE1 = "com.example.notenrechner.EXTRA_NUMBER1"; //eine Konstante
    public static final String EXTRA_NOTE2 = "com.example.notenrechner.EXTRA_NUMBER2"; //eine Konstante

    /*
    Onclick listener welcher auf eine andere Activity verweist
    Methode um die neue activity zu öffnen
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durchschnitt_noten);
        setTitle("Noten Eingabe");

        Button open_durchschnitt_berechnen =(Button) findViewById(R.id.open_durchschnitt_berechnen); //castet den Button mit einen neuen Button hier
        open_durchschnitt_berechnen.setOnClickListener(new View.OnClickListener() { //neuer Onclicklistener
            @Override
            public void onClick(View view) {
                openDurchschnitt(); //methode anwenden
            }
        });
    }

    /*
    Methode welche auf eine andere Acitivty verweist
    in der Methode sind Regel für die Eingaben in den Text Feldern
    If ELSE bedingung
     */

    public void  openDurchschnitt() { //methode um activity zu wechseln

        EditText note_1 = (EditText) findViewById(R.id.note_1); //verbindete den Edittext mit einem edittext hier
        EditText note_2 = (EditText) findViewById(R.id.note_2); //verbindete den Edittext mit einem edittext hier


        if (note_1.getText().toString().equals("") //if bedingung, wenn das Zahlen Feld leer ist wird eine Nachricht (toast) angezeigt
                || note_2.getText().toString().equals("")){
            Toast.makeText(Durchschnitt_Noten.this, "Bitte note eingeben", Toast.LENGTH_SHORT).show(); //toast erstellen
        }

        else { //Falls etwas eingegeben wird, wird das else ausgeführt
            float note_1_durchschnitt = Float.parseFloat(note_1.getText().toString()); //schreibt den Edittext in einen String und dann in einen INT
            float note_2_durschnitt = Float.parseFloat(note_2.getText().toString()); //schreibt den Edittext in einen String und dann in einen INT

            Intent intent_durchschnitt = new Intent(this, Durchschnitt_berechnen.class); //neuer Intent
            intent_durchschnitt.putExtra(EXTRA_NOTE1, note_1_durchschnitt); //befüllt den intent mit der nummer
            intent_durchschnitt.putExtra(EXTRA_NOTE2, note_2_durschnitt); //befüllt den intent mit der nummer
            startActivity(intent_durchschnitt); //startet die zweite Activity
        }
    }
}