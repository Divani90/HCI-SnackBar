package com.example.snackbar_itgm;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Bebidas extends ActionBarActivity {

	protected TextView costomFont;
	private List<String> lista;
	private Spinner spinner1;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bebidas);
		
		DatosPorDefecto();
		
		costomFont=(TextView)findViewById(R.id.textView1);
		Typeface font = Typeface.createFromAsset(getAssets(), "TasteTheBacon.ttf");
		costomFont.setTypeface(font);
		//Instanciamos el Boton
        Button botonV1 = (Button) findViewById(R.id.Volver3);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonV1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Bebidas.this, Opciones.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
        
      //Instanciamos el Boton
        Button botonA1 = (Button) findViewById(R.id.Add2);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonA1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Bebidas.this, Opciones.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
        
      //Instanciamos el Boton
        Button botonT1 = (Button) findViewById(R.id.Terminar2);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonT1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Bebidas.this, Pedidos.class);
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
		   lista.add("Coca-Cola 600ml    $10.00");
		   lista.add("Agua 1lt           $11.00");
		   lista.add("Boing 250ml         $8.00");
		   lista.add("Boing 500ml        $15.00");
		   ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
		   adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		   spinner1.setAdapter(adaptador);
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bebidas, menu);
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
