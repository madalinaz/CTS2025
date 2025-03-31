package dp.C5.prototype;

import dp.C5.prototype.clase.AContract;
import dp.C5.prototype.clase.ContractCorporate;
import dp.C5.prototype.clase.PrototypeFactory;

public class Program {

	public static void main(String[] args) {
		//fara prototypeFactory
		AContract contractCorporate1 = new ContractCorporate();
		System.out.println(contractCorporate1);
		AContract contractCorporate3 = 
				(ContractCorporate) contractCorporate1.clone();
		ContractCorporate contractCorporate2 = new ContractCorporate();
		System.out.println(contractCorporate2);
		
		
		//cu prototype factory
		AContract contractParty1 = PrototypeFactory
				.getPrototipContract("party");
		if(contractParty1 != null) {
			contractParty1.setId("3");
			System.out.println(contractParty1);
		}
		
		contractParty1.modifListaClauze(1, "New");
		System.out.println(contractParty1);
		
		AContract contractParty2 = PrototypeFactory
				.getPrototipContract("party");
		if(contractParty2 != null){
			contractParty2.setId("4");
			System.out.println(contractParty2);
		}

		
		//testare shallow-copy fara Prototype
		System.out.println("\nTestare shallow-copy fara Prototype");
		if(contractCorporate1.getListaClauze() == contractCorporate2.getListaClauze())
			System.out.println("Aceleasi clauze contractuale");
		else
			System.out.println("Referinte la obiecte diferite");
		
		//testare shallow-copy cu Prototype
		System.out.println("Testare shallow-copy cu Prototype");
		if(contractParty1.getListaClauze() == contractParty2.getListaClauze())
			System.out.println("Aceleasi clauze contractuale");
		else
			System.out.println("Referinte la obiecte diferite");
	}
}


