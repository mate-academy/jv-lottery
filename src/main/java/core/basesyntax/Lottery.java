package core.basesyntax;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final NumberSupplier numberSupplier = new NumberSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), numberSupplier.getRandomNumber());
    }
}
