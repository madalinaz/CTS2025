package DP.Structurale.Composite.ex2;



public class Program {

	public static void main(String[] args) {
		ANode container = new Container(120);
		ANode cutie1 = new Container(10);
		ANode cutie2 = new Container(12);
		container.adauga(cutie1);
		container.adauga(cutie2);
		
		cutie1.adauga(new Colet(2, false));
		cutie1.adauga(new Colet(4, false));
		
		//cutie2.adauga(new Colet(10, false));
		
		System.out.println(container.getGreutate());
		System.out.println(container.esteFragil());
		
	}

}
