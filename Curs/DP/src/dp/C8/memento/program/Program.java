package dp.C8.memento.program;


import dp.C8.memento.clase.Contract;
import dp.C8.memento.clase.ManagerContracte;

public class Program {

	public static void main(String[] args) {
		ManagerContracte managerContracte = new ManagerContracte();
		Contract contract = new Contract("Client1");
		
		//salvare versiuni contracte
		contract.adaugaClauzeContractuale("Clauza1");
		System.out.println(contract);
		contract.adaugaClauzeContractuale("Clauza2");
		System.out.println(contract);
		managerContracte.adaugaVersiune(contract.salvare());
		
		contract.adaugaClauzeContractuale("Clauza3");
		System.out.println(contract);
		managerContracte.adaugaVersiune(contract.salvare());
		
		//recuperare versiuni anterioare
		contract.refacereVersiuneContractAnterior
		(managerContracte.recuperareVersiune(0));
		System.out.println(contract);

	}

}
