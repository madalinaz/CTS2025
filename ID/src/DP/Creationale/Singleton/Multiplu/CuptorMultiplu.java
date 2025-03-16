package DP.Creationale.Singleton.Multiplu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuptorMultiplu {
	private static Map<Integer, CuptorMultiplu> instances;
	private List<Preparat> listaAsteptare=null;
	private int gradeMaxim;
	private int id;

	//initializare eager
	static {
		instances = new HashMap<>();
		//simulam preluarea dintr-un fisier
		instances.put(1, new CuptorMultiplu(1, 280));
		instances.put(2, new CuptorMultiplu(2, 250));
		instances.put(3, new CuptorMultiplu(3, 245));
		instances.put(4, new CuptorMultiplu(4, 280));
	}
	
	private CuptorMultiplu(int id, int gradeMaxim) {
		this.id=id;
		this.gradeMaxim=gradeMaxim;
		this.listaAsteptare=new ArrayList<>();
	}
	
	public int timpAsteptare() {
		int total=0;
		for(Preparat p:this.listaAsteptare) {
			total+=p.getNrMinuteGatire();
		}
		return total;
	}
	
	public static CuptorMultiplu getInstance(int id) {
		return instances.get(id);
	}
	
	public static void addPreparat(Preparat p) {
		//decid carui cuptor sa il adaug
		CuptorMultiplu cMinim = instances.get(1);
		for(CuptorMultiplu c: instances.values()) {
			if(c.timpAsteptare()<cMinim.timpAsteptare()) {
				cMinim=c;
			}
		}
		cMinim.listaAsteptare.add(p);
	}
}
