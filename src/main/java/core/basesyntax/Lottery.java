package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();

        Ball ball = new Ball();
        ball.setColor(randomColor);
        ball.setNumber(ball.getRandomNumber());

        return ball;
    }
}
