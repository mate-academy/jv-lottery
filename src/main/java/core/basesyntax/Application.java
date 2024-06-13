package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        NumberSupplier numberSupplier = new NumberSupplier();
        Lottery randomBall = new Lottery(colorSupplier, numberSupplier);
        for (int i = 0; i < 3; i++) {
            System.out.println(randomBall.getRandomBall());
        }
    }
}
