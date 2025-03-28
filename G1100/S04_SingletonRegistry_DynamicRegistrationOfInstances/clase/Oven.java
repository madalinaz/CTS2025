package week4_SingletonRegistryLazy.clase;

import java.util.*;

public class Oven {
    private static final Map<Integer, Oven> registry = new HashMap<Integer, Oven>();
    private static int idNext = 0;
    private static int NR_MAX_OVENS = 4;

    private int id;
    private List<Dish> preparationQueue;
    private int maximumGrades;

    private Oven(int maximumGrades) {
        id = idNext++;
        preparationQueue = new ArrayList<>();
        this.maximumGrades = maximumGrades;
    }

    public static void registryOven(int maximumGrades) {
        if (idNext >= NR_MAX_OVENS) {
            System.out.println("[FAILED]: You do not have enough space for this oven!");
            return;
        }
        Oven oven = new Oven(maximumGrades);
        registry.put(oven.id, oven);
    }

    public static Map<Integer, Oven> getRegistry() {
        return registry;
    }

    public static Oven getOvenById(int id) {
        return registry.getOrDefault(id, null);
    }

    public int calculateOvenWaitingTime() {
        int totalWaitingTime = 0;
        for (Dish dish : this.preparationQueue) {
            totalWaitingTime += dish.getCookingTime();
        }
        return totalWaitingTime;
    }

    public static void addDish(Dish dish) throws RuntimeException{
        PriorityQueue<Oven> ovensPQ = new PriorityQueue<>(Comparator.comparingInt(Oven::calculateOvenWaitingTime));

        ovensPQ.addAll(registry.values());

        while (!ovensPQ.isEmpty()) {
            Oven oven = ovensPQ.poll();

            if (dish.getCookingGrades() <= oven.maximumGrades) {
                oven.preparationQueue.add(dish);
                return;
            }
        }

        throw new RuntimeException("No oven available for this dish: " + dish.getName());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Oven{");
        sb.append("id=").append(id);
        sb.append(", preparationQueue=").append(preparationQueue);
        sb.append(", maximumGrades=").append(maximumGrades);
        sb.append('}');
        return sb.toString();
    }
}
