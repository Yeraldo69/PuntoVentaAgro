package com.yenko.puntoventaagro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        /* Ponemos el titulo a la ventana actual */
        this.setTitle("Agro - Registrarse");
    }

    public void clickLink(View v){
        /* Cerramos la ventana actual */
        this.finish();
        /* Hacemos un Intent para pasar a la ventana de iniciar sesion cuando
         * se toque el boton de iniciar sesion */
        Intent intento = new Intent(this, MainActivity.class);
        /* Lanzamos la actiuvidad */
        startActivity(intento);

    }

    public void registrarse(View v){
        /* Proceso de inicio de sesion */
        return;
    }
}