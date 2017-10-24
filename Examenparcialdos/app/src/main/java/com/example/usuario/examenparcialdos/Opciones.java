package com.example.usuario.examenparcialdos;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Opciones extends AppCompatActivity {
    ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        lista = (ListView) findViewById(R.id.ListLT);

        String[] companeros={"1.- Leer placa","2.- Vehiculos Afiliados","3.- Acerca de...","4.- Cerrar sesión"};

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(lista.getContext(),android.R.layout.simple_list_item_1,companeros);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {

                String selectedFromList =(String) (lista.getItemAtPosition(myItemInt));


                switch (selectedFromList){
                    case "1.- Leer placa":
                        Intent myIntent = new Intent(Opciones.this, qr.class);
                        Opciones.this.startActivity(myIntent);
                        finish();
                        break;



                    case "2.- Vehiculos Afiliados":
                        Intent myIntent3 = new Intent(Opciones.this, principal.class);
                        Opciones.this.startActivity(myIntent3);
                        finish();
                        break;



                    case "3.- Acerca de...":
                        createRadioListDialog();
                        break;


                    case "4.- Cerrar sesión":
                        Intent myIntent2 = new Intent(Opciones.this, Login.class);
                        Opciones.this.startActivity(myIntent2);
                        finish();
                        break;
                }
            }
        });

    }

    public void createRadioListDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Acerca de...")

                .setMessage("Bryan E. Peña Gomez"+"\n3551"+"\nITIT"+"\nExamen")

                .setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent retornar = new Intent(Opciones.this, Login.class);
                        Opciones.this.startActivity(retornar);
                        finish();
                    }
                })


                .setNegativeButton("Perfil de github", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Uri uriUrl = Uri.parse("https://github.com/Bryan07182/Android-2017");
                        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                    }
                });

        builder.show();
    }


}
