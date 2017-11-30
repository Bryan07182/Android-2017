package com.example.usuario.parcialtres;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private Button btnlocalizacion;
    // Will show the string "data" that holds the results
    TextView informacion;
    // URL of object to be parsed
    String JsonURL = "https://api.myjson.com/bins/twhiz";
    // This string will hold the results
    String data = "";
    // Defining the Volley request queue that handles the URL request concurrently
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Creates the Volley request queue
        requestQueue = Volley.newRequestQueue(this);

        // Casts results into the TextView found within the main layout XML with id jsonData
        informacion = (TextView) findViewById(R.id.json);
        btnlocalizacion = (Button) findViewById(R.id.btn);
        final ImageView imagen =(ImageView)findViewById(R.id.img);

        // Creating the JsonObjectRequest class called obreq, passing required parameters:
        //GET is used to fetch data from the server, JsonURL is the URL to be fetched from.
        JsonObjectRequest obreq = new JsonObjectRequest(Request.Method.GET, JsonURL,
                // The third parameter Listener overrides the method onResponse() and passes
                //JSONObject as a parameter
                new Response.Listener<JSONObject>() {

                    // Takes the response from the JSON request
                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            // Retrieves the string labeled "colorName" and "description" from
                            //the response JSON Object
                            //and converts them into javascript objects

                            JSONObject obj = response.getJSONObject("empleado");

                            String nombres = obj.getString("nombre");
                            String paterno = obj.getString("apaterno");
                            String materno = obj.getString("amaterno");
                            String calle = obj.getString("direccion");
                            final String ubi = obj.getString("latylon");
                            String sangre = obj.getString("sangre");
                            String foto = obj.getString("imagen");

                            byte[] decodedString = Base64.decode(foto, Base64.DEFAULT);

                            Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
                            imagen.setImageBitmap(decodedByte);

                            // Adds strings from object to the "data" string
                            data += "Nombres: " + nombres + "\nA. Paterno: " + paterno
                            + "\nA. Materno: " + materno + "\nDireccion: " + calle + "\nUbicacion: " + ubi +
                            "\nTipo de sangre: " + sangre +"\nImagen:";

                            // Adds the data string to the TextView "results"
                            informacion.setText(data);

                            btnlocalizacion.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    Intent myIntent = new Intent(MainActivity.this, MapsActivity.class);
                                    myIntent.putExtra("mapa", ubi);
                                    MainActivity.this.startActivity(myIntent);
                                }
                            });
                        }
                        // Try and catch are included to handle any errors due to JSON
                        catch (JSONException e) {
                            // If an error occurs, this prints the error to the log
                            e.printStackTrace();
                        }
                    }
                },
                // The final parameter overrides the method onErrorResponse() and passes VolleyError
                //as a parameter
                new Response.ErrorListener() {
                    @Override
                    // Handles errors that occur due to Volley
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Volley", "Error");
                    }
                }
        );
        // Adds the JSON object request "obreq" to the request queue
        requestQueue.add(obreq);
    }
}