package Controlador;

import Modelo.ListaMaterias;
import Vista.VistaMateria;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.Toast;

import com.example.proyecto.R;

public class CMaterias extends LinearLayout{
    private Activity a;
    private Button buttonAdd;
    private EditText add;
	public CMaterias(final Activity activity, final ListaMaterias myModel, final VistaMateria myView) {
		super(activity, null);
        a = activity;
		LayoutInflater layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = layoutInflater.inflate(R.layout.materias, this);
		ViewGroup container = (ViewGroup) findViewById(R.id.TableLayoutAddMaterias);
		final ImageButton button = (ImageButton) view.findViewById(R.id.addMateria);
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				myView.addView();
                buttonAdd = (Button) myView.findViewById(R.id.ButtonAgregar);
                add = (EditText) myView.findViewById(R.id.editTextAdd);
                buttonAdd.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {

                        myModel.addMateria(add.getText().toString());
                        add.setText("");
                        Toast.makeText(activity.getBaseContext(), "Materia agregada", Toast.LENGTH_SHORT).show();
                    }
                });
                    }
                });
	}
}

