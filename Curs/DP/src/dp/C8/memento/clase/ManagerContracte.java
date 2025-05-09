package dp.C8.memento.clase;

import java.util.ArrayList;

//clasa CareTaker din diagrama GoF
public class ManagerContracte {
	private ArrayList<VersiuneContract> listaVersiuni = new ArrayList();
	
	public void adaugaVersiune(VersiuneContract versiuneContract){

		this.listaVersiuni.add(versiuneContract);
	}
	
	public VersiuneContract recuperareVersiune(int i){

		return listaVersiuni.get(i);
	}
}
