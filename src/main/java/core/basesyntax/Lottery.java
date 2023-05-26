package core.basesyntax;

public class Lottery {
    private static final int BOUND = 100;
    private final Ball ball = new Ball();
    private final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        int value = supplier.getRandom().nextInt(BOUND);

        ball.setNumber(value);
        ball.setColor(supplier.getRandomColor());
        return ball;
    }
}
