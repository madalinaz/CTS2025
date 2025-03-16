package DP.Creationale.Prototype;

import java.util.ArrayList;

public class ContractParty extends AContract{
	public ContractParty() {
		System.out.println("Incarcare contract party DIN BD");
		//proces consumator de timp(preluare din BD)
		listaClauze = new ArrayList<>();
		listaClauze.add("clauza 1 party");
		listaClauze.add("clauza 2 party");
		this.tip = "party";
	}

	@Override
	void printare() {
		System.out.println("Contract de tip " + this.tip);
	}
	
	@Override
	public AContract clone() {
		AContract clone = super.clone();
		clone.listaClauze = new ArrayList<>();
		for(int i=0; i<this.listaClauze.size(); i++){
			clone.listaClauze.add(new String(this.listaClauze.get(i)));
		}
		
		return clone;
	}
}
