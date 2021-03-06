package com.example.usuario.derechoaexamen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Dialog extends AppCompatActivity {

     Button mostrar, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        mostrar = (Button) findViewById(R.id.mostrar);
        regresar = (Button) findViewById(R.id.atras);

        mostrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                android.app.Dialog settingsDialog = new android.app.Dialog(v.getContext());
                settingsDialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                settingsDialog.setContentView(getLayoutInflater().inflate(R.layout.image_layout, null));
                settingsDialog.setCanceledOnTouchOutside(true);
                settingsDialog.show();

            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(Dialog.this, MainActivity.class);
                Dialog.this.startActivity(myIntent);
                finish();

            }
        });
    }
}
