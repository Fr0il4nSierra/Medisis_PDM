package com.example.loginmedisisv3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    Button ingresar,crear_cuenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);

        ingresar = findViewById(R.id.ingresar);
        crear_cuenta = findViewById(R.id.crear_cuenta);

        crear_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this,Main3Activity.class));
                finish();
            }
        });

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Main2Activity.this, "Bienvendio", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
