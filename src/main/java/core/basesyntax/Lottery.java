package core.basesyntax;

public class Lottery {
    private static final int BOUND = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int randomNumber = colorSupplier.getRandom().nextInt(BOUND);
        return new Ball(randomNumber, colorSupplier.getRandomColor());
    }
}
