package com.example.proyecto;


import Controlador.Inicio;
import Vista.Encabesado;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ViewGroup;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); 
		
		//final MyModel myModel = new MyModel();
		final Encabesado myView = new Encabesado(this);
	    final Inicio inicio = new Inicio(this,myView);
	    
	    ViewGroup container = (ViewGroup) findViewById(R.id.myLayout);
	    container.addView(myView);
	    container.addView(inicio);  
	}
}
