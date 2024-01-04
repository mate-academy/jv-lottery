package core.basesyntax;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final int size = 100;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), colorSupplier.getRandom().nextInt(size));
    }
}
