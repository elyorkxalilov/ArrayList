import java.util.Arrays;

enum Fasl {
    QISH("Dekabr, Yamvat Fevral"), BAHOR("Mart, Aprel, May"), YOZ("Iyun Iyul Avgust"), KUZ("Sentabr Oktabr Noyabr");

    private final String moons;
    Fasl(String moons) {
        this.moons=moons;
    }

    public String getMoons() {
        return moons;
    }
}

class Main1 {
    public static void main(String[] args) {
        for (Fasl fasl : Fasl.values()) {
            System.out.println(fasl + " -> "+fasl.getMoons());
        }
    }

}
