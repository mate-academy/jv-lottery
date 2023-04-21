package core.basesyntax;

public class Lottery extends ColorSupplier {
    private static final int MAX_BOLL_FOR_RANDOM = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),random.nextInt(MAX_BOLL_FOR_RANDOM));
    }
}

