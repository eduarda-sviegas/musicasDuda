package com.example.musicasduda;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sortear(View view) {

        int trecho = new Random().nextInt(5);
        TextView TextResultado3 = findViewById(R.id.textResultado3);

       switch(trecho){

            case 1:

                TextResultado3.setText("You'll never be alone");

                break;

           case 2:

               TextResultado3.setText("You won't remember all my champagne problems");

               break;

           case 3:

               TextResultado3.setText("Eu tô cansado de sofrer quero dançar, sentir calor");

               break;

           case 4:

               TextResultado3.setText("Meu riso é tão feliz contigo");

           case 5:

               TextResultado3.setText("I lose myself in a daydream");
       }

    }
}