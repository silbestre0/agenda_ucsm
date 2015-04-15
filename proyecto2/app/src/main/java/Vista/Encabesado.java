package Vista;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.example.proyecto.Materias;
import com.example.proyecto.R;

public class Encabesado extends LinearLayout {
	Activity a;
	public Encabesado(Activity activity) {
		super(activity, null);
		a = activity;
		//LayoutInflater layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		//layoutInflater.inflate(R.layout.encabezado, this);
	}
	
	public void setView(String s)
	{
		switch(s)
		{
		case "Materias":
			Intent intent = new Intent(a,Materias.class);
			a.startActivity(intent); 
			break;
			
		}
	}
	
}
