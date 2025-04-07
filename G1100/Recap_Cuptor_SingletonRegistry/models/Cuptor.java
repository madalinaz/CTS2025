package Creationale.X_Practice.ovenLazy.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cuptor {
    private static List<Cuptor> registry = new ArrayList<>();

    private String producator;
    private List<String> preparationQueue;
    private int maximumGrades;

    private Cuptor(String producator, int maximumGrades) {
        this.producator = producator;
        this.maximumGrades = maximumGrades;
        this.preparationQueue = new ArrayList<>();
    }

    // Restrictie de maxim 5 cuptoare - presupunem ca mereu ID-ul este unic
    public static void adaugaCuptor(String producator, int maximumGrades) {
        if (registry.size() > 5) {
            System.out.println("Numarul maxim de cuptoare a fost atins.");
            return;
        }
        Cuptor cuptor = new Cuptor(producator, maximumGrades);
        registry.add(cuptor);
    }

    // Metoda getInstanta NU poate sa fie apelata in context de unicitate
    // Pot sa iau al treilea din lista sau cuptorul cu cele mai putine preparate
    public static Cuptor getCuptorCuCeleMaiPutinePreparate() {
        Cuptor min = registry.getFirst();
        for (Cuptor cuptor : registry) {
            if (cuptor.preparationQueue.size() < min.preparationQueue.size()) {
                min = cuptor;
            }
        }
        return min;
    }

    public static Cuptor getCuptorCuCeleMaiPutineGrade() {
        Cuptor min = registry.getFirst();
        for (Cuptor cuptor : registry) {
            if (cuptor.maximumGrades < min.maximumGrades) {
                min = cuptor;
            }
        }
        return min;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", preparationQueue=").append(preparationQueue);
        sb.append(", maximumGrades=").append(maximumGrades);
        sb.append('}');
        return sb.toString();
    }
}
