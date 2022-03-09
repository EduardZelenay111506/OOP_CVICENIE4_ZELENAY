package sk.stuba.fei.uim.oop.Zvierata;

public class Macka extends Zviera {
   public Macka(String meno){
       this.meno = meno;
   }

    @Override
    public void zvukZvierata() {
        System.out.println("Mnau Mnau");
    }

    @Override
    public void behaj() {
        System.out.println("");
    }
}
