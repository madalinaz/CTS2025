package S10_FlyWeight.program;

import S10_FlyWeight.models.FlyWeightFactory;
import S10_FlyWeight.models.FormaGeometrica;
import S10_FlyWeight.models.TipForma;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica1 = FlyWeightFactory.getFormaGeometrica(TipForma.TRIUNGHI);
        formaGeometrica1.desenare(21, 21);

        FormaGeometrica formaGeometrica2 = FlyWeightFactory.getFormaGeometrica(TipForma.PATRAT);
        formaGeometrica2.desenare(21, 0);

        FormaGeometrica formaGeometrica3 = FlyWeightFactory.getFormaGeometrica(TipForma.CERC);
        formaGeometrica3.desenare(1000, 0);
    }
}
