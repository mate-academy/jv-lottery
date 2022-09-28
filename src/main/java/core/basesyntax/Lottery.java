package core.basesyntax;

public class Lottery extends ColorSupplier {
    private static final int LIMITER = 100;

    public Ball getRandomBall() {
        return new Ball(getRandomColor(), random.nextInt(LIMITER));
    }
}
