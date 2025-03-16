package DP.Comportamentale.Command;

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
