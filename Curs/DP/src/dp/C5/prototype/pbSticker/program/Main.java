package dp.C5.prototype.pbSticker.program;

import dp.C5.prototype.pbSticker.clase.Masina;
import dp.C5.prototype.pbSticker.clase.PrototypeStickerFactory;
import dp.C5.prototype.pbSticker.clase.Sticker;

public class Main {
    public static void main(String[] args) {
        Masina m1 = new Masina("Skoda",2010);
        Masina m2 = new Masina("Skoda",2015);

        try {
            Sticker sticker1 = PrototypeStickerFactory.getPrototip(m1.getCodUnic());
            Sticker sticker2 = PrototypeStickerFactory.getPrototip(m1.getCodUnic());
            Sticker sticker3 = PrototypeStickerFactory.getPrototip(m1.getCodUnic());
            sticker2.setCuloare("Negru");
            System.out.println(sticker1);
            System.out.println(sticker2);
            System.out.println(sticker3);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        //implementare PrototypeFactory in format lazy
        //adica populez hashMap doar cand este prima oara nevoie de obj respectiv
    }
}
