package core.basesyntax;

public class Lottery {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_BALL_NUMBER = 101;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), SingletonRandom.getInstance().nextInt(MAX_BALL_NUMBER));
    }
}
