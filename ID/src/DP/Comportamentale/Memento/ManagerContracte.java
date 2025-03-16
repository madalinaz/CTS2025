package DP.Comportamentale.Memento;

import java.util.ArrayList;


public class ManagerContracte {
	private ArrayList<VersiuneContract> listaVersiuni = new ArrayList();
	
	public void adaugaVersiune(VersiuneContract versiuneContract){
		this.listaVersiuni.add(versiuneContract);
	}
	
	public VersiuneContract recuperareVersiune(int i){
		return listaVersiuni.get(i);
	}
}
