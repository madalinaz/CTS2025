package s06.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPersonaj implements  Cloneable{
    protected List<String> listaMesaje;
    protected List<String> listaArme;
    protected int nivelViata;


    public abstract void ataca(AbstractPersonaj personaj);

    public String spuneCeva(){
        return this.listaMesaje.get(0);
    }

    @Override
    protected AbstractPersonaj clone() throws CloneNotSupportedException {
        //implementare deep pentru lista arme pentru ca asta e comportament comun
        AbstractPersonaj clona = (AbstractPersonaj) super.clone();
        clona.listaArme = new ArrayList<>();
        for(String arma: this.listaArme){
            clona.listaArme.add(arma);
        }
        return clona;
    }

    void durere(){
        this.nivelViata-=10;
        if(this.nivelViata<0)
            this.nivelViata=0;
    }

    @Override
    public String toString() {
        return "AbstractPersonaj{" +
                "listaMesaje=" + listaMesaje +
                ", listaArme=" + listaArme +
                ", nivelViata=" + nivelViata +
                '}';
    }
}
