package com.yenko.puntoventaagro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.yenko.puntoventaagro.databinding.ActivityVentanaPrincipalBinding;

public class VentanaPrincipal extends AppCompatActivity {

    /*
    You need to change ActivityMainBinding with ActivityClassNameBinding.
    ClassName is the name of the activity where you write the code.
     */
    ActivityVentanaPrincipalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVentanaPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Fragment del inicio para cuando se inicie la ventana sea lo primero que veamos
        replaceFragment(new Fragment_Inicio());

        binding.bottomNav.setOnItemSelectedListener(item -> {

            //Para comprobar que item esta seleccionando el usuario
            switch (item.getItemId()){

                case R.id.menuInicio:
                    replaceFragment(new Fragment_Inicio());
                    break;

                case R.id.menuAnadir:
                    replaceFragment(new Fragment_Anadir());
                    break;

                case R.id.menuAjustes:
                    replaceFragment(new Fragment_Ajustes());
                    break;

            }
            //Para que no dé error
            return true;
        });
    }

    //Metodo para reemplazar el fragment actual por el que el usuario quiere
    private void replaceFragment(Fragment fragment){
        //Fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Fragment transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //Reemplazamos el fragment
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }
}