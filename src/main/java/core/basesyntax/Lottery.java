package core.basesyntax;

public class Lottery {
    private final ColorSupplier colorSupplier;
    private final NumberSupplier numberSupplier;

    public Lottery(ColorSupplier colorSupplier, NumberSupplier numberSupplier) {
        this.colorSupplier = colorSupplier;
        this.numberSupplier = numberSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), numberSupplier.getRandomNumber());
    }
}
