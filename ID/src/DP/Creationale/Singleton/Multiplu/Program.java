package DP.Creationale.Singleton.Multiplu;

public class Program {

	public static void main(String[] args) {
		Preparat p1 = new Preparat("paine", 45, 270);
		Preparat p2 = new Preparat("pizza",15,250);
		Preparat p3 = new Preparat("friptura",20,210);
		
		Cuptor.getInstance(280).addPreparat(p1);
		Cuptor.getInstance(280).addPreparat(p2);
		Cuptor.getInstance(280).addPreparat(p3);
		
		System.out.println(Cuptor.getInstance(280));
	}

}
