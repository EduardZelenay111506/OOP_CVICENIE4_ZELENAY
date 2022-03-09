package sk.stuba.fei.uim.oop.Zvierata;

public class Pes extends Zviera implements Plavanie {
    public Pes(String meno) {
        this.meno = meno;
    }

    @Override
    public void zvukZvierata() {
        System.out.println("Hau Hau");
    }

    @Override
    public void behaj() {
        System.out.println("cupity cup");
    }

    @Override
    public void plavaj() {
        System.out.println("clup clup");
    }
}
