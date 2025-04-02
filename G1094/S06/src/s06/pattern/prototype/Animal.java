package s06.pattern.prototype;

import java.util.ArrayList;

public class Animal extends AbstractPersonaj{

    public Animal() {
        System.out.println("Preluare info despre Animal din surse externe");
        this.listaArme = new ArrayList<>();
        this.listaArme.add("Gheara");
        this.listaArme.add("Coada");
        this.listaArme.add("Iz urat mirositor");
        this.listaMesaje = new ArrayList<>();
        this.listaMesaje.add("Zzzzzz");
        this.listaMesaje.add("Auch");
    }

    @Override
    public void ataca(AbstractPersonaj personaj) {
        personaj.durere();
        this.listaArme.add(personaj.listaArme.get(0));
        personaj.listaArme.remove(0);
    }

    @Override
    protected AbstractPersonaj clone() throws CloneNotSupportedException {
        AbstractPersonaj clona = super.clone();
        clona.listaMesaje = new ArrayList<>();
        for(String mesaj:this.listaMesaje){
            clona.listaMesaje.add(mesaj);
        }
        return clona;
    }
}
