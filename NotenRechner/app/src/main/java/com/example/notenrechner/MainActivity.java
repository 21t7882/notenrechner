package com.example.notenrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
            Ist ein Button mit Onclicklistener welcher für das öffnen der anderen Activitys sorgt
            Mit Methode openDurchschnitt_note
         */
        Button button_durchschnitt_noten =(Button) findViewById(R.id.button_durchschnitt_noten); //castet den Button mit einen neuen Button hier
        button_durchschnitt_noten.setOnClickListener(new View.OnClickListener() { //neuer Onclicklistener
            @Override
            public void onClick(View view) {
                openDurchschnitt_noten(); //methode anwenden
            }
        });

        /*
        Button mit Onclicklistener für das öfnnen anderer Activitys
        Mit methode OpenNote_punkte
         */
        Button button_noteberechnen_punkte =(Button) findViewById(R.id.button_noteberechnen_punkte); //castet den Button mit einen neuen Button hier
        button_noteberechnen_punkte.setOnClickListener(new View.OnClickListener() { //neuer Onclicklistener
            @Override
            public void onClick(View view) {
                openNoten_punkte(); //methode anwenden
            }
        });


    }

    /*
    Methode welche für das Öffnen zuständig ist
     */
    public void  openDurchschnitt_noten() { //methode um activity zu wechseln
            Intent intent_durchschnitt = new Intent(this, Durchschnitt_Noten.class); //neuer Intent
            startActivity(intent_durchschnitt); //startet die zweite Activity
        }

    /*
    Methode welche für das öffnen zuständig ist
     */
    public void  openNoten_punkte() { //methode um activity zu wechseln
        Intent intent_note = new Intent(this, Note_punkte.class); //neuer Intent
        startActivity(intent_note); //startet die zweite Activity
    }
}
