package com.example.snackbar_itgm;

import android.support.v7.app.ActionBarActivity;
import android.app.NotificationManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Notificacion extends ActionBarActivity {

	protected TextView costomFont;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notificacion);
		Button boton1 = (Button) findViewById(R.id.Button01);
		
		costomFont=(TextView)findViewById(R.id.textView1);
		Typeface font = Typeface.createFromAsset(getAssets(), "TasteTheBacon.ttf");
		costomFont.setTypeface(font);
        
        //Implementación del botón "Salir"
          boton1.setOnClickListener(new View.OnClickListener() {
                 
            public void onClick(View v) {
                    setResult(RESULT_OK);
                    finish();
            }
        });
          
          NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
          
          // Cancelamos la Notificacion que hemos comenzado
          nm.cancel(getIntent().getExtras().getInt("notificationID"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.notificacion, menu);
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
