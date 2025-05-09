package dp.C8.template.clase;

public abstract class AEvaluareDaune {
	abstract void identificareDauna();
	abstract void evaluareInitialaDauna();
	abstract void trimitereEvaluareManager();
	
	public final void proceduraEvaluareDaune(){
		identificareDauna();
		evaluareInitialaDauna();
		trimitereEvaluareManager();
	}
}
