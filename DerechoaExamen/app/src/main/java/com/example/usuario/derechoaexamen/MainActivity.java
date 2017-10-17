package com.example.usuario.derechoaexamen;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

     ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.ListLT);

        String[] companeros={"1.- Escaner QR","2.- pasardatos datos","3.- Dialogos","4.- Grid","5.- Salir"};

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(lista.getContext(),android.R.layout.simple_list_item_1,companeros);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {

                String selectedFromList =(String) (lista.getItemAtPosition(myItemInt));


                switch (selectedFromList){
                    case "1.- Escaner QR":
                        Intent myIntent = new Intent(MainActivity.this, qr.class);
                        MainActivity.this.startActivity(myIntent);
                        finish();



                        break;
                    case "2.- pasardatos datos":
                        Intent myIntent1 = new Intent(MainActivity.this, pasardatos.class);
                        MainActivity.this.startActivity(myIntent1);
                        finish();



                        break;
                    case "3.- Dialogos":
                        Intent myIntent2 = new Intent(MainActivity.this, Dialog.class);
                        MainActivity.this.startActivity(myIntent2);
                        finish();




                        break;
                    case "4.- Grid":
                        Intent myIntent3 = new Intent(MainActivity.this, principal.class);
                        MainActivity.this.startActivity(myIntent3);
                        finish();


                        break;
                    case "5.- Salir":
                        createRadioListDialog();


                        break;
                }
            }
        });

    }
    public void createRadioListDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("La app esta por cerrarce")
                .setMessage("¿Esta seguro de cerrar la aplicacion?")
                .setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();


                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.show();
    }


}
