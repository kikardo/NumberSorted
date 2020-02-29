package com.wikup.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void sorteiaTexto(View view){

        TextView texto = findViewById (R.id.secondTextView);
        int numerosorteado = new Random().nextInt (11);
        texto.setText("O número sorteado é: " + numerosorteado);

    }
}
