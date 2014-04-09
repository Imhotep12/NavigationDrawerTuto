package com.tutos.android.navigationdrawertuto;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Duplicatat extends Activity {
	
	
	private Button retour_acceuil;
	protected void onCreate(Bundle savedInstantState) {
		
		super.onCreate(savedInstantState);
		setContentView(R.layout.duplicatat_item);
		retour_acceuil=(Button) findViewById(R.id.btn_retour_acceuil);
	    retour_acceuil.setOnClickListener(new retourAcceuil());
	}
	
	
	
	
	private class retourAcceuil implements OnClickListener {
		

		@Override
		public void onClick(View v) {
			finish ();  
			Intent intent = new Intent (Duplicatat.this, MainActivity.class);
		    startActivityForResult(intent, 0);
			
		}
		
	}
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()) {
	   
	        case R.id.text_title:
	                
	                return true;
	        case R.id.logo_gim:
	              
	                return true;
	        default:
	                return super.onOptionsItemSelected(item);
	        }
	}

}
