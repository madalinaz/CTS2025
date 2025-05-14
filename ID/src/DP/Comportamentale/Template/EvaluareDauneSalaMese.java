package DP.Comportamentale.Template;

public class EvaluareDauneSalaMese extends AEvaluareDaune{
    @Override
    void evaluareInitialaDauna() {
        System.out.println("S-a facut o evaluare initiala pentru daune sala mese ");
    }

    @Override
    void trimitereEvaluareManager() {
        System.out.println("S-a trimis catre manager pentru finalizare evaluare daune sala de mese");
    }
}
