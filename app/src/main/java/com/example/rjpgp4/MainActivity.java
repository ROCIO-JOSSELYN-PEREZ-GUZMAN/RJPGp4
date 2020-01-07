package com.example.rjpgp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GridView datos;
        contenido contenido;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datos=findViewById(R.id.datos);

        ArrayList<String> arreglo= new ArrayList<String>();
        arreglo.add("Rocio");
        arreglo.add("Josselyn");
        arreglo.add("Diana");
        arreglo.add("Virginia");
        arreglo.add("Daniel");
        arreglo.add("jhonatan");
        arreglo.add("Jair");
        arreglo.add("Huriel");
        arreglo.add("Domingo");
        arreglo.add("Abelina");
        arreglo.add("Lidia");
        arreglo.add("Jose");
        arreglo.add("Maria");
        arreglo.add("Andrea");
        arreglo.add("Carolina");
        arreglo.add("Araceli");

        contenido= new contenido(this,arreglo);
        datos.setAdapter(contenido);

    }
}

