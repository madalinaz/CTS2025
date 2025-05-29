package dp.C12.state.clase;

public abstract class AStare {
	protected Bucatar bucatar;
	
	public abstract void preiaComanda(String comanda);
	public abstract void iaPauza();
	
	public AStare(Bucatar bucatar) {
		super();
		this.bucatar = bucatar;
	}
	
	
}
