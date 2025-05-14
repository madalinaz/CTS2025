package DP.Comportamentale.Template;

public abstract class AEvaluareDaune {
	//pasul identificareDauna este acelasi, indiferent de tipul daunei
	final void identificareDauna(){
		System.out.println("S-a facut o evaluare initiala a daunei (PAS FIX)");
	}
	abstract void evaluareInitialaDauna();
	abstract void trimitereEvaluareManager();
	
	public final void proceduraEvaluareDaune(){
		identificareDauna();
		evaluareInitialaDauna();
		trimitereEvaluareManager();
	}
}
