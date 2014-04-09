package com.tutos.android.navigationdrawertuto;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;



public class paiement_activity extends Activity {
	
	private Button valider_amount;
	private Button retour_acceuil;
	private String[] drawerItemsList;
	private ListView myDrawer;
	private TextView myTextView;
	private ActionBarDrawerToggle mDrawerToggle;
	private DrawerLayout drawerLayout;
	

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.paiement_item);
		// getActionBar().setDisplayHomeAsUpEnabled(true);
		myDrawer = (ListView) findViewById(R.id.my_drawer);
		valider_amount = (Button) findViewById(R.id.btn_amount);
	    valider_amount.setOnClickListener( new OnvaliderAmount());
	    retour_acceuil=(Button) findViewById(R.id.btn_retour_acceuil);
	    retour_acceuil.setOnClickListener(new retourAcceuil());
	   // getActionBar().setDisplayHomeAsUpEnabled(true);
		// getActionBar().setHomeButtonEnabled(true);

	
		
	}


	private class OnvaliderAmount implements OnClickListener {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(paiement_activity.this, num_paiemment_activity.class);
			startActivityForResult(intent, 0);
		}
   }
	
	
	
	
	
	private class retourAcceuil implements OnClickListener{
		
		@Override
		    public void onClick (View v) {
			  
			Intent intent = new Intent (paiement_activity.this, MainActivity.class);
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