package S10_Adapter.program;

import S10_Adapter.clase.*;

public class Main {
    public static void main(String[] args) {
        // Companie Emag
        ICalculReducere calculReducere = new CalculReducereEmag();
        Client clientEmag = new Client("John Doe", 100000);
        System.out.println(calculReducere.getReducere(clientEmag));

        // Companie XYZ
        IEvaluareClient calculReducereXYZ = new CalculReducereXYZ();
        System.out.println(calculReducereXYZ.acordaDiscount(299));

        // Companie XYZ dupa fuziunea cu Emag (folosind adapter)
        IEvaluareClient evaluareClient2 = new AdapterXYZ2Emag();
        System.out.println(evaluareClient2.acordaDiscount(10000));
    }
}
