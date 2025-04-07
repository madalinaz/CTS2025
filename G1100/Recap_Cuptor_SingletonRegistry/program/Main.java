package Creationale.X_Practice.ovenLazy.program;

import Creationale.X_Practice.ovenLazy.models.Cuptor;

public class Main {
    public static void main(String[] args) {
        Cuptor.adaugaCuptor("Electrolux", 200);
        Cuptor.adaugaCuptor("Whirlpool", 250);
        Cuptor.adaugaCuptor("Samsung", 300);
        Cuptor.adaugaCuptor("LG", 350);

        System.out.println(Cuptor.getCuptorCuCeleMaiPutineGrade());
    }
}
