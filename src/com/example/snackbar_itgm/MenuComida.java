package com.example.snackbar_itgm;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import android.widget.Button;
import android.content.Intent;

public class MenuComida extends ActionBarActivity {

	
	private List<String> lista;
	private Spinner spinner1;
	protected TextView costomFont;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_comida);
		DatosPorDefecto();
		
		costomFont=(TextView)findViewById(R.id.textView1);
		Typeface font = Typeface.createFromAsset(getAssets(), "TasteTheBacon.ttf");
		costomFont.setTypeface(font);
		
		//Instanciamos el Boton
        Button botonV1 = (Button) findViewById(R.id.Volver1);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonV1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MenuComida.this, Opciones.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
        
      //Instanciamos el Boton
        Button botonA1 = (Button) findViewById(R.id.Add);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonA1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MenuComida.this, Opciones.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
		
        
      //Instanciamos el Boton
        Button botonT1 = (Button) findViewById(R.id.Terminar3);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonT1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MenuComida.this, Pedidos.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
		
	}
	
	private void DatosPorDefecto() {
		   spinner1 = (Spinner) findViewById(R.id.spinner1);
		   lista = new ArrayList<String>();
		   spinner1 = (Spinner) this.findViewById(R.id.spinner1);
		   lista.add("Torta de Salchicha $14.00");
		   lista.add("Torta de Pierna    $16.00");
		   lista.add("Hamburguesas       $19.00");
		   lista.add("Torta Especial     $25.00");
		   lista.add("Molletes           $12.00");
		   ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
		   adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		   spinner1.setAdapter(adaptador);
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_comida, menu);
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
