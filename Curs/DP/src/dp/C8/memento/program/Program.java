package dp.C8.memento.program;


import dp.C8.memento.clase.Contract;
import dp.C8.memento.clase.ManagerContracte;

public class Program {

	public static void main(String[] args) {
		ManagerContracte managerContracte = new ManagerContracte();
		Contract contract = new Contract("Gigel");
		
		//modificari pe Originator + salvare versiuni contracte (Memento-uri)
		contract.adaugaClauzeContractuale("Clauza1");
		System.out.println(contract);
		contract.adaugaClauzeContractuale("Clauza2");
		System.out.println(contract);
		managerContracte.adaugaVersiune(contract.saveToMemento());
		
		contract.adaugaClauzeContractuale("Clauza3");
		System.out.println(contract);
		managerContracte.adaugaVersiune(contract.saveToMemento());
		
		//recuperare versiuni anterioare
		contract.restoreFromMemento(managerContracte.recuperareVersiune(0));
		System.out.println(contract);

		Contract contract2 = new Contract("Costel");

	}

}
