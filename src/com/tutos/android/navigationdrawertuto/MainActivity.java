package com.tutos.android.navigationdrawertuto;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity  {

	private String[] drawerItemsList;
	private ListView myDrawer;
	private TextView myTextView;
	private ActionBarDrawerToggle mDrawerToggle;
	private DrawerLayout drawerLayout;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
      String text[]= {" PARAMETRAGE"," PAIEMENT"," REMBOURSSEMENT"," PARAMETRE"," A PROPOS"};
      int imageId[]={R.drawable.lg_parametrage, R.drawable.lg_paiement, R.drawable.lg_remboursement,
    		  R.drawable.lg_parametre, R.drawable.lg_apropos};
		drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

		myTextView = (TextView) findViewById(R.id.display_drawer_txt);

		drawerItemsList = getResources().getStringArray(R.array.items);
		myDrawer = (ListView) findViewById(R.id.my_drawer);
		myDrawer.setAdapter(new MenuList (this, text, imageId) );

		myDrawer.setOnItemClickListener(new MyDrawerItemClickListener());

		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);

		mDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
				R.drawable.ferlo6, R.string.ouverture, R.string.fermeture) {
			public void onDrawerClosed(View view) {
				getActionBar().setTitle(R.string.titre);
				invalidateOptionsMenu();
			}

			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle(R.string.titre_apres_ouverture);
				invalidateOptionsMenu();
			}
		};
		
		
		drawerLayout.setDrawerListener(mDrawerToggle);
		
		
	}

	private class MyDrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> adapter, View v, int pos, long id) {
			String clickedItem = (String) adapter.getAdapter().getItem(pos);
			Log.d("position :", ""+pos);
			Intent intent0 = new Intent(MainActivity.this, parametrage_activity.class);
			Intent intent1 = new Intent(MainActivity.this, paiement_activity.class);
			Intent intent2 = new Intent(MainActivity.this, Remboursement_activity.class);
			Intent intent3 = new Intent(MainActivity.this, Duplicatat.class);
			Intent intent4 = new Intent(MainActivity.this, Parametres_activity.class);
			switch (pos) {
			case 0: startActivityForResult(intent0, 0);return;
			case 1: startActivityForResult(intent1, 1);return;
			case 2: startActivityForResult(intent2, 2);return;
			case 3: startActivityForResult(intent3, 3);return;
			case 4: startActivityForResult(intent4, 4);return;
			default :setContentView(R.layout.activity_main);
			
			}
			
	
			
		/*	myTextView.setText(clickedItem); */
				drawerLayout.closeDrawer(myDrawer); 
		}
	}

	
	@Override
   protected void onActivityResult (int requestcode,int response,Intent data)
	{
		
		
	}
		   
		   
		   
	
/*	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		switch (item.getItemId()) {
		case R.id.action_settings:
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	
*/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		
		if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
	        switch (item.getItemId()) {
	   
	        case R.id.text_title:
	                // Comportement du bouton "Aide"
	                return true;
	        case R.id.logo_gim:
	                // Comportement du bouton "Rafraichir"
	                return true;
	        case R.id.title:
                // Comportement du bouton "Rafraichir"
                return true;
	        default:
	                return super.onOptionsItemSelected(item);
	        }
	}

}
