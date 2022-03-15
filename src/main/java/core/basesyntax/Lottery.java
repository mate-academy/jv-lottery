package core.basesyntax;

public class Lottery {
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber((int)Math.floor(Math.random() * (100 - 0 + 1) + 0));
        return ball;
    }
}
