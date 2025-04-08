package dp.C9.facade.clase;

import java.util.ArrayList;

public class GestiuneBucatari {
private ArrayList<Bucatar> listaBucatari;
	
	public GestiuneBucatari() {
		this.listaBucatari=new ArrayList<>();
	}
	
	public void addBucatar(Bucatar b) {
		this.listaBucatari.add(b);
	}
	
	public Bucatar getBucatar(int i) {
		return this.listaBucatari.get(i);
	}
	
	public int getNrBucatari() {
		return this.listaBucatari.size();
	}
}
