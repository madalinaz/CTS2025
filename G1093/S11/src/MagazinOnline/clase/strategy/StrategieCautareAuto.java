package MagazinOnline.clase.strategy;

import MagazinOnline.clase.Cautare;
import MagazinOnline.clase.ICautare;

public class StrategieCautareAuto implements IStrategy {
    @Override
    public ICautare getCautare() {
        return new Cautare(true, true, true, "roz", 120, 38);
    }
}
