package DP.Creationale.Prototype;

import java.util.ArrayList;

public abstract class AContract implements Cloneable{
	private String id;
	protected String tip;
	protected ArrayList<String> listaClauze;
	
	public void modifListaClauze(int i, String clauzaNoua){
		listaClauze.set(i, clauzaNoua);
	}
	
	abstract void printare();
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTip() {
		return tip;
	}
	
	public ArrayList<String> getListaClauze() {
		return listaClauze;
	}

	@Override
	public String toString() {
		return "AContract [id=" + id + ", tip=" + tip + ", listaClauze=" + listaClauze + "]";
	}

	@Override
	public AContract clone()
	{
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}		
		
		return (AContract) clone;
	}
}
