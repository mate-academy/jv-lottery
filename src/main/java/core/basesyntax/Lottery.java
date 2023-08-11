package core.basesyntax;

public class Lottery {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(colorSupplier.getRmInt());
        return ball;
    }
}