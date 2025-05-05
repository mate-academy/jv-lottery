package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier supplier = new ColorSupplier();
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
