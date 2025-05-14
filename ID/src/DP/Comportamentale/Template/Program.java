package DP.Comportamentale.Template;


public class Program {

	public static void main(String[] args) {
		AEvaluareDaune evaluareDauneBucatarie = 
				new EvaluareDauneBucatarie();
		System.out.println("Procedura evaluare daune");
		evaluareDauneBucatarie.proceduraEvaluareDaune();

		AEvaluareDaune evaluareDauneSalaMese= new EvaluareDauneSalaMese();

		System.out.println("Procedura evaluare daune");
		evaluareDauneSalaMese.proceduraEvaluareDaune();
	}

}
