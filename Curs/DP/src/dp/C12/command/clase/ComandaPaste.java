package dp.C12.command.clase;

public class ComandaPaste implements IComanda {
	private String tipPaste;
	private Bucatar bucatar;

	public ComandaPaste(String tipPaste, Bucatar bucatar) {
		super();
		this.tipPaste = tipPaste;
		this.bucatar = bucatar;
	}

	@Override
	public void prelucreaza() {
		this.bucatar.preparaPaste(tipPaste);
	}

}
