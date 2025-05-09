package dp.C8.memento.clase;

//clasa Memento
public class VersiuneContract {
	//contine doar campurile care sunt modificabile din Originator/Contract
	private String clauzeContractuale;

	public VersiuneContract(String clauzeContractuale) {
		super();
		this.clauzeContractuale = clauzeContractuale;
	}

	public String getClauzeContractuale() {
		return clauzeContractuale;
	}
	
}
