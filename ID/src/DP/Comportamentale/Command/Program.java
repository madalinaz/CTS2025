package DP.Comportamentale.Command;

public class Program {

	public static void main(String[] args) {
		//executanti - bucatari
		Bucatar bucatar = new Bucatar("Gigel");
		//definire comenzi
		IComanda c1 = new ComandaPaste("paste A", bucatar);
		IComanda c2 = new ComandaPizza("pizza A", "subtire", bucatar);
		
		Ospatar ospatar = new Ospatar();
		ospatar.preiaComanda(c1);
		ospatar.preiaComanda(c2);
		//dupa un timp
		//plasare comenzi spre bucatarie
		ospatar.transmiteComenzile();

	}

}
