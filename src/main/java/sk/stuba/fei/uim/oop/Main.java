package sk.stuba.fei.uim.oop;
import sk.stuba.fei.uim.oop.Zvierata.Macka;
import sk.stuba.fei.uim.oop.Zvierata.Pes;


public class Main {
    public static void main(String[] args) {
        var dunco = new Pes("dunco");
        var garfield = new Macka("Garfield");

        dunco.pohladkat();
        garfield.pohladkat();
    }
}
