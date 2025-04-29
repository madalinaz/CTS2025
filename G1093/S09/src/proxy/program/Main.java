package proxy.program;

import proxy.clase.*;

public class Main {
    public static void main(String[] args) {
        Vizitator vizitator1=new Vizitator("Vizitator 1");
        Vizitator vizitator2=new Vizitator("Vizitator 2");

        Pacient pacient1=new Pacient("Pacient1", "02.02.2025");
        Pacient pacient2=new Pacient("Pacient2", "02.02.2025");
        Pacient pacient3=new Pacient("Pacient3", "02.02.2025");

        ISpital spital=new ProxySpital(new Spital()); //cu proxy

        //ISpital spital=new Spital() ; fara proxy

        spital.vizitarePacient(vizitator1, pacient1);
        //spital.vizitarePacient(vizitator2, pacient1); 
        spital.vizitarePacient(vizitator2, pacient2);


    }

}
