package com.example.proyecto;

import Modelo.ListaMaterias;
import Vista.VistaMateria;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ViewGroup;
import Controlador.CMaterias;
public class Materias extends ActionBarActivity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ListaMaterias myModel = new ListaMaterias();
		final VistaMateria myView = new VistaMateria(this);
	    final CMaterias myController = new CMaterias(this, myModel, myView);
	    
	    ViewGroup container = (ViewGroup) findViewById(R.id.myLayout);
        container.addView(myView);
	    container.addView(myController);

	}

}
