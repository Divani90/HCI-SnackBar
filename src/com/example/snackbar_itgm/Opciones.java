package com.example.snackbar_itgm;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


import android.widget.Button;
import android.content.Intent;
public class Opciones extends ActionBarActivity {
	protected TextView costomFont;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_opciones);
		 
		costomFont=(TextView)findViewById(R.id.textView1);
		Typeface font = Typeface.createFromAsset(getAssets(), "TasteTheBacon.ttf");
		costomFont.setTypeface(font);
		
		//Botones
		//Boton volver
		//Instanciamos el Boton
        Button botonV = (Button) findViewById(R.id.Volver);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonV.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Opciones.this, Inicio.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
        
      //Boton Comida
      //Instanciamos el Boton
        Button botonC = (Button) findViewById(R.id.Comida);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Opciones.this, MenuComida.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
        //Boton Bebida
        //Instanciamos el Boton
        Button botonB = (Button) findViewById(R.id.Bebidas);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Opciones.this, Bebidas.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
        //Boton Snacks
        //Instanciamos el Boton
        Button botonS = (Button) findViewById(R.id.Snacks);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Opciones.this, Snacks.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
        
      //Instanciamos el Boton
        Button botonT = (Button) findViewById(R.id.button05);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Opciones.this, Pedidos.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.opciones, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
