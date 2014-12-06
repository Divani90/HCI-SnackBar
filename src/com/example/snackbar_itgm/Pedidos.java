package com.example.snackbar_itgm;

import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pedidos extends ActionBarActivity {

	int notificationID = 1;
	protected TextView costomFont;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pedidos);
		
		costomFont=(TextView)findViewById(R.id.textView1);
		Typeface font = Typeface.createFromAsset(getAssets(), "TasteTheBacon.ttf");
		costomFont.setTypeface(font);
		
		//Instanciamos el Boton
        Button botonV1 = (Button) findViewById(R.id.VolverU);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonV1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Pedidos.this, Opciones.class);
                startActivity(intent);
                
                setResult(RESULT_OK);
                finish();
            }
        });
        
      //Instanciamos el Boton
        Button botonN = (Button) findViewById(R.id.btnMostrarNotificacion);
 
        /*
          Definimos un método OnClickListener para que
          al pulsar el botón se nos muestre la segunda actividad
        */
        botonN.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v){
                Intent i = new Intent(Pedidos.this, Notificacion.class);
                i.putExtra("notificationID", notificationID);
                 
                PendingIntent pendingIntent = PendingIntent.getActivity(Pedidos.this, 0, i, 0);
                NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                 
                CharSequence ticker ="Nueva entrada en SekthDroid";
                CharSequence contentTitle = "SnackBar-ITGAM";
                CharSequence contentText = "Tu orden esta lista!";
                Notification noti = new NotificationCompat.Builder(Pedidos.this)
                                        .setContentIntent(pendingIntent)
                                        .setTicker(ticker)
                                        .setContentTitle(contentTitle)
                                        .setContentText(contentText)
                                        .setSmallIcon(R.drawable.logo)
                                        .setVibrate(new long[] {100, 250, 100, 500})
                                        .build();
                nm.notify(notificationID, noti);
            
                setResult(RESULT_OK);
                finish();
                System.exit(1);
        }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pedidos, menu);
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
