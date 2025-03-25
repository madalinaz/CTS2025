package s05.clase;

public class Pizza implements IProdus{
    public int idPizza;
    private String denumire;
    private String listaIngrediente;

    public Pizza(String denumire, String listaIngrediente, int idPizza) {
        this.denumire = denumire;
        this.listaIngrediente = listaIngrediente;
        this.idPizza = idPizza;
    }

    public int getIdPizza() {
        return idPizza;
    }

    @Override
    public String getDenumireProdus() {
        return this.denumire;
    }

    @Override
    public void getDescriere() {
        System.out.println(this.toString());
    }

    @Override
    public int getId() {
        return getIdPizza();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "denumire='" + denumire + '\'' +
                ", listaIngrediente='" + listaIngrediente + '\'' +
                ", id='" + idPizza + '\'' +
                '}';
    }
}
