package core.basesyntax;

public class Lottery {
    private final ColorSupplier cs = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(cs.getRandomColor());
        ball.setNumber(getRandomNumber());
        return ball;
    }

    private int getRandomNumber() {
        double r = Math.random();
        double r1 = r * (100 + 1);
        double r2 = r1 + 0;
        return (int) r2;
    }
}
