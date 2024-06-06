package core.basesyntax;

public class Lottery {
    private Ball ball;
    private ColorSupplier supplier;

    public Ball getRandomBall() {
        ball = new Ball();
        ball.setColor(new ColorSupplier().getRandomColor());
        ball.getRandomNumber();
        ball.toString();
        return ball;
    }
}
