package Controlador;


import Vista.Encabesado;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.proyecto.R;


public class Inicio extends LinearLayout{
	public Inicio(Activity activity, final Encabesado myView) {
		super(activity, null);
		LayoutInflater layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = layoutInflater.inflate(R.layout.menu, this);
 
		
		
		final ImageButton button = (ImageButton) view.findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				myView.setView("Materias");
			}
		}); 
//		
//		final Button button3 = (Button) view.findViewById(R.id.button3);
//		button3.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				myModel.setModel('3');
//				myView.setView(myModel.getModel());
//			}
//		}); 
//		
//		final Button button4 = (Button) view.findViewById(R.id.button4);
//		button4.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				myModel.setModel('4');
//				myView.setView(myModel.getModel());
//			}
//		}); 
//		
//		final Button button5 = (Button) view.findViewById(R.id.button5);
//		button5.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				myModel.setModel('5');
//				myView.setView(myModel.getModel());
//			}
//		}); 
}}
