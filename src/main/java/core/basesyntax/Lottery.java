package core.basesyntax;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 101;
    private ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(supplier.getRandomColor(), supplier.getRandom().nextInt(MAX_BALL_NUMBER));
    }
}
