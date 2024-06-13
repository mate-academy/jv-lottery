package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        NumberSupplier numberSupplier = new NumberSupplier();
        Lottery randomBall = new Lottery(colorSupplier, numberSupplier);
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            System.out.println(randomBall.getRandomBall());
        }
    }
}
