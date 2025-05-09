package dp.C8.template.clase;

public class EvaluareDauneBucatarie extends AEvaluareDaune{
	@Override
	void identificareDauna() {
		System.out.println("Identificare dauna bucatarie");
	}

	@Override
	void evaluareInitialaDauna() {
		System.out.println("Evaluare initiala dauna bucatarie");
	}

	@Override
	void trimitereEvaluareManager() {
		System.out.println("Trimitere evaluare daune spre manager");
	}
}
