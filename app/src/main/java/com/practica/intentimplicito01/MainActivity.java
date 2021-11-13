package com.practica.intentimplicito01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textURL = (EditText) findViewById(R.id.editText);
    }

    public void visitaWeb(View view) {

        //recogemos el contenido del TextView, que será una URL
        String url = textURL.getText().toString();

        //creamos un intent, indicando la acción que llevará a cabo. En este caso, abrir una ventana
        //del navegador con la dirección especificada en el segundo parámetro, por medio de una URI
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        //iniciamos una nueva actividad pasando el intent
        startActivity(intent);
    }
}