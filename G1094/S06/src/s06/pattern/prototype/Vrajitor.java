package s06.pattern.prototype;

import java.util.ArrayList;

public class Vrajitor extends AbstractPersonaj{

    public Vrajitor() {
        System.out.println("Preluare info despre Vrajitor din surse externe");
        this.listaArme = new ArrayList<>();
        this.listaArme.add("Bagheta magica");
        this.listaArme.add("Palarie care inteapa");
        this.listaMesaje = new ArrayList<>();
        this.listaMesaje.add("Abracadabra");
        this.listaMesaje.add("Te atac!");
    }
    @Override
    public void ataca(AbstractPersonaj personaj) {
        personaj.durere();
        this.listaMesaje.add(personaj.spuneCeva());
    }
}
