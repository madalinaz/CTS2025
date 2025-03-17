package dp.C3.SOLID.O.After.v2.clase;

public abstract class  ICalculator<T extends Angajat> {
     private T angajat;
     public ICalculator(T angajat) {
          this.angajat = angajat;
     }

     public T getAngajat() {
          return angajat;
     }

     public abstract float  calculSalariu();
}
