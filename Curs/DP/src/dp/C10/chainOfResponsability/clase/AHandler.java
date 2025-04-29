package dp.C10.chainOfResponsability.clase;

public abstract class AHandler {
	private AHandler nextHandler;
	
	public AHandler getNextHandler(){
		return this.nextHandler;
	}

	public void setNextHandler(AHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract void procesareComanda(Comanda comanda);
}
