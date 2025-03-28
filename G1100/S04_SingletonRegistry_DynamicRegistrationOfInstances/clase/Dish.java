package week4_SingletonRegistryLazy.clase;

public class Dish {
    private String name;
    private int cookingTime;
    private int cookingGrades;

    public Dish(String name, int cookingTime, int cookingGrades) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.cookingGrades = cookingGrades;
    }

    public String getName() {
        return name;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public int getCookingGrades() {
        return cookingGrades;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dish{");
        sb.append("name='").append(name).append('\'');
        sb.append(", cookingTime=").append(cookingTime);
        sb.append(", cookingGrades=").append(cookingGrades);
        sb.append('}');
        return sb.toString();
    }
}
