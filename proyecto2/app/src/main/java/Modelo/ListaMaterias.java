package Modelo;

import java.util.ArrayList;

public class ListaMaterias {
	private ArrayList<String> Materias;
	public ListaMaterias()
	{
		Materias = new ArrayList<String>();
	}
	public void addMateria(String materia)
	{
		Materias.add(materia);
	}
	public ArrayList<String> getListaDeMaterias()
	{
		return Materias;
	}
}
