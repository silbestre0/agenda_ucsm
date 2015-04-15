package Vista;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.proyecto.R;

public class VistaMateria extends LinearLayout{
	//private Activity a;
    private LayoutInflater layoutInflater;
	public VistaMateria(Activity activity) {
		super(activity, null);
        layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //layoutInflater.inflate(R.layout.addmateria, this);
		//a = activity;
       //LayoutInflater layoutInflater = (LayoutInflater)a.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //layoutInflater.inflate(R.layout.addmateria, this);
	}
	public void addView() {

        layoutInflater.inflate(R.layout.addmateria, this);
		 //ViewGroup container = (ViewGroup) findViewById(R.id.myLayout);


}
	public void vistaView()
	{
//		LayoutInflater layoutInflater = (LayoutInflater)a.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//		layoutInflater.inflate(R.layout.addmateria, this);
	}
}