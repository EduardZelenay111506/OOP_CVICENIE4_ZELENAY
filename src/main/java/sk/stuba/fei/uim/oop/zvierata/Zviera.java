package sk.stuba.fei.uim.oop.zvierata;

public abstract class Zviera implements Behanie {
    protected String meno;

    public abstract void zvukZvierata();

    public void pohladkat() {
        System.out.println(this.meno + " bol pohladkany");
        this.zvukZvierata();
    }
}
