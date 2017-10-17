package com.example.usuario.derechoaexamen;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

public class principal extends AppCompatActivity
 implements AdapterView.OnItemClickListener {

         GridView gridView;
         listaimg adaptador;
     Button regresar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_principal);
            gridView = (GridView) findViewById(R.id.grid);
            regresar = (Button) findViewById(R.id.atras);
            adaptador = new listaimg(this);
            gridView.setAdapter(adaptador);
            gridView.setOnItemClickListener(this);

            regresar.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent myIntent = new Intent(principal.this, MainActivity.class);
                    principal.this.startActivity(myIntent);
                    finish();

                }
            });
        }






    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        guitars item = (guitars) parent.getItemAtPosition(position);

        Intent intent = new Intent(this, detalle.class);
        intent.putExtra(detalle.EXTRA_PARAM_ID, item.getId());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            ActivityOptionsCompat activityOptions =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            this,
                            new Pair<View, String>(view.findViewById(R.id.imagen_coche),
                                    detalle.VIEW_NAME_HEADER_IMAGE)
                    );

            ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
        } else
            startActivity(intent);
    }


}
