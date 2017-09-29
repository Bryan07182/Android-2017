package com.example.usuario.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox gansito;
    EditText password,num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gansito=(CheckBox) findViewById(R.id.chbGansito);
        password=(EditText) findViewById(R.id.etPassword);
        num=(EditText) findViewById(R.id.etNum);


        if(gansito.isChecked()==true){
            Toast.makeText(this, "Esta marcado", Toast.LENGTH_SHORT).show();

        }else{

            Toast.makeText(this, "No esta marcado", Toast.LENGTH_SHORT).show();
        }

        gansito.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(gansito.isChecked()==true){

                    password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    Toast.makeText(getApplicationContext(), "Esta marcado", Toast.LENGTH_SHORT).show();

                }else{

                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    Toast.makeText(getApplicationContext(), "No esta marcado", Toast.LENGTH_SHORT).show();

                }

            }
        });

        num.addTextChangedListener(new CustomWatcher());

    }

    public class CustomWatcher implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            if (s.length() > 0) {

                if (Integer.parseInt(s.toString()) > 1000) {

                    gansito.setChecked(true);

                } else {

                    gansito.setChecked(false);
                }
            }
        }
        @Override
        public void afterTextChanged(Editable s) {

        }
    }
}
