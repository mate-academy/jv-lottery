package core.basesyntax;

public class Lottery {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),
                colorSupplier.getRandom().nextInt(MAX) + MIN);
    }
}
