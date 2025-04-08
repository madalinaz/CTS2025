package dp.C9.facade.clase;

import java.util.ArrayList;

public class GestiuneSali {
	private ArrayList<Sala> listaSali;

	public GestiuneSali() {
		this.listaSali = new ArrayList<Sala>();
	}
	
	public void addSala(Sala s) {
		this.listaSali.add(s);
	}
}
