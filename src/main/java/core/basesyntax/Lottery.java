package core.basesyntax;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), colorSupplier.getRandomNumber());
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }
}
