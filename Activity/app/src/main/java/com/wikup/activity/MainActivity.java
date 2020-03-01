package com.wikup.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity { // extends herda os recursos da Classe
    // AppcompatActivity, que é uma classe de compatibilidade

    @Override
    protected void onCreate (Bundle savedInstanceState) { // Oncreate chamado qdo tela é criada
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main); // xml, setContentView configura o activity_main
        // que é o xml

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart () {
        super.onStart ();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume () {
        super.onResume (); //o
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause () {
        super.onPause ();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop () {
        super.onStop ();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart () {
        super.onRestart ();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy () {
        super.onDestroy ();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
