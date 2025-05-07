package S10.decorator.clase;

public class Bon implements IBon{
    private String data;
    private float suma;

    public Bon(String data, float suma) {
        this.data = data;
        this.suma = suma;
    }

    @Override
    public void printare() {
        System.out.print("se printeaza bonul "+ this.data+" cu suma "+this.suma);
    }

    @Override
    public String getData() {
        return this.data;
    }

    public float getSuma() {
        return suma;
    }
}
