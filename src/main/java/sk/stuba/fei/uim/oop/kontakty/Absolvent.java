package sk.stuba.fei.uim.oop.kontakty;

public class Absolvent extends Kontakt{
    protected String titul;

    public Absolvent(String titul, String meno, String priezvisko){
        super(meno,priezvisko);
        this.titul = titul;
    }

    public void  setMeno(String meno){
        this.meno=meno;
    }

    @Override
    public String toString() {
        return this.titul + " " +super.toString();
    }
}
