package com.example.loginmedisisv3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    Button iniciar_sesion,reguistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_main);

        iniciar_sesion = findViewById(R.id.iniciar_sesion);
        reguistro = findViewById(R.id.reguistro);

        iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main3Activity.this, Main2Activity.class));
                finish();
            }
        });
        reguistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main3Activity.this,"Registro Exitoso",Toast.LENGTH_LONG).show();

            }
        });
    }
}
