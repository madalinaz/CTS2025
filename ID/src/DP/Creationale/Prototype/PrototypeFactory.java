package DP.Creationale.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
private static Map<String, AContract> prototipuriContracte = new HashMap<>();
	
	static {
		System.out.println("Initializare contracte prin citirea din BD");
		ContractCorporate contractCorporate = new ContractCorporate();
		prototipuriContracte.put("corporate", contractCorporate);
		
		ContractParty contractParty = new ContractParty();
		prototipuriContracte.put("party", contractParty);
	}
	
	public static AContract getPrototipContract(String tip) {
		AContract contract = null;
		AContract prototipContract = prototipuriContracte.get(tip);
		if(prototipContract!=null)
			contract = prototipContract.clone();
		return contract;
	}
}
