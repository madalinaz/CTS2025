package dp.C8.template.program;


import dp.C8.template.clase.AEvaluareDaune;
import dp.C8.template.clase.EvaluareDauneBucatarie;

public class Program {

	public static void main(String[] args) {
		AEvaluareDaune evaluareDauneBucatarie =
				new EvaluareDauneBucatarie();
		System.out.println("Procedura evaluare daune");
		evaluareDauneBucatarie.proceduraEvaluareDaune();
	}

}
