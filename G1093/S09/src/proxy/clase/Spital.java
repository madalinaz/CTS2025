package proxy.clase;

public class Spital implements ISpital{



    @Override
    public void vizitarePacient(Vizitator vizitator, Pacient pacient) {
        System.out.println("Vizitatorul "+vizitator+" a vizitat pacientul "+pacient);
    }
}
