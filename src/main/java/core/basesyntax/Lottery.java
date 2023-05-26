package core.basesyntax;

public class Lottery {
    private NumberSupplier numberSupplier = new NumberSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), numberSupplier.getRandomNumber());
    }
}
