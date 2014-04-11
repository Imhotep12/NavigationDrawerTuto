package com.tutos.android.navigationdrawertuto;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class parametrage_activity extends Activity {
	
	private DrawerLayout drawerLayout;
	private ActionBarDrawerToggle mDrawerToggle;
	private Button retour_acceuil;
	private AlertDialog alertDialogBuilder;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	 alertDialogBuilder= new AlertDialog.Builder(this).create();
		setContentView(R.layout.num_paiement_item);
		retour_acceuil=(Button) findViewById(R.id.btn_retour_acceuil);
	    retour_acceuil.setOnClickListener(new retourAcceuil());
		
		//getActionBar().setDisplayHomeAsUpEnabled(true);
		// getActionBar().setHomeButtonEnabled(true);
		
	}
	
	
 private class retourAcceuil implements OnClickListener{
		
	 
			
			@Override
			    public void onClick (View v) {
				
				  Intent intent = new Intent (parametrage_activity.this, MainActivity.class);
				  startActivityForResult(intent, 0);
				  finish ();
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
	                // Comportement du bouton "Aide"
	                return true;
	        case R.id.logo_gim:
	                // Comportement du bouton "Rafraichir"
	                return true;
	        default:
	                return super.onOptionsItemSelected(item);
	        }
	}
	
		 
}

      	