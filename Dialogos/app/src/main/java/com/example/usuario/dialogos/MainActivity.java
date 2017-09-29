package com.example.usuario.dialogos;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button img, cerrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (Button) findViewById(R.id.btnImg);
        cerrar = (Button) findViewById(R.id.btnCerrar);



        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Dialog settingsDialog = new Dialog(v.getContext());
                settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.imagen, null));
                settingsDialog.setCanceledOnTouchOutside(true);
                settingsDialog.show();

            }
        });

        cerrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                createRadioListDialog();

            }
        });

    }

    public void createRadioListDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("La app esta por cerrarce")
                .setMessage("¿Esta seguro de cerrar la app?")
                .setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);

                    }
                })
                .setNegativeButton("Volver", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.show();
    }
}
