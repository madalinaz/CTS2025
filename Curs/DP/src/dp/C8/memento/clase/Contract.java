package dp.C8.memento.clase;


public class Contract {
	private String clauzeContractuale;
	private String numeClient;
	
	public Contract(String numeClient) {
		this.numeClient = numeClient;
		this.clauzeContractuale = "";
	}
	
	public void adaugaClauzeContractuale(String clauza){
		this.clauzeContractuale += ", " + clauza;
	}
	
	@Override
	public String toString() {
		return "Contract [clauzeContractuale=" + clauzeContractuale
				+ ", numeClient=" + numeClient + "]";
	}
	
	public void refacereVersiuneContractAnterior(VersiuneContract versiuneContract){
		this.clauzeContractuale = versiuneContract.getClauzeContractuale();
	}
	
	public VersiuneContract salvare(){
		System.out.println("Salvare versiune contract");
		return new VersiuneContract(clauzeContractuale);
	}
}
