package core.basesyntax;

public class Lottery {
    private final int randomBound = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), colorSupplier
                .getRandom().nextInt(randomBound));
    }
}
