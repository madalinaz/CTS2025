package MagazinOnline.clase.strategy;

import MagazinOnline.clase.ICautare;

public class Client {
    private String nume;
    private IStrategy strategie;

    public Client(String nume) {
        this.nume = nume;
    }

    public void setStrategie(IStrategy strategie) {
        this.strategie = strategie;
    }

    public ICautare getCautare(){
        if(strategie != null){
            return strategie.getCautare();
        }else {
            System.out.println("Nu a fost setată nicio strategie.");
            return null;
        }
    }
}
