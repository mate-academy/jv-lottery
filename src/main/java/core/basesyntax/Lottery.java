package core.basesyntax;

public class Lottery {
    private Ball ball = new Ball();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(colorSupplier.getRmInt(100));
        return ball;
    }
}