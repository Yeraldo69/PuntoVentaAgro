package com.yenko.puntoventaagro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Dormimos el hilo para que se vea el Splash*/
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /* Devolvemos el tema al tema original que debe tener la app, para que
        * ya no muestre el Splash */
        this.setTheme(R.style.Theme_PuntoVentaAgro);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Ponemos el titulo a la ventana actual */
        this.setTitle("Agro - Iniciar sesión");
    }

    public void clickLink(View v){
        /* Cerramos la ventana actual */
        this.finish();
        /* Hacemos un Intent para pasar a la ventana de registro cuando
        * se toque el boton de registrarse */
        Intent intento = new Intent(this, Registro.class);
        /* Lanzamos la actiuvidad */
        startActivity(intento);
    }

    public void iniciarSesion(View v){
        /* Proceso de inicio de sesion */
        /* Cerramos la ventana actual */
        this.finish();
        /* Hacemos un Intent para pasar a la ventana principal cuando
         * se toque el boton de inciar sesion */
        Intent intento = new Intent(this, VentanaPrincipal.class);
        startActivity(intento);
    }


}