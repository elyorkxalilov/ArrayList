package Lesson_13.Icecream;

public abstract class Suger {
     private int sugerMass;   // shakar kilosi
     private int sugerSumm;   // 1 kg shakar narxi

    public Suger(int sugerMass, int sugerSumm) {
        this.sugerMass = sugerMass;
        this.sugerSumm = sugerSumm;
    }

    public int getSugerMass() {
        return sugerMass;
    }

    public int getSugerSumm() {
        return sugerSumm;
    }
}
