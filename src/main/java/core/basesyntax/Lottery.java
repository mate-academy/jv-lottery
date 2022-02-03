package core.basesyntax;

public class Lottery {
   private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber((byte) (Math.random() * 100));
        ball.setColor(Color.valueOf(colorSupplier.getRandomColor()));
        return ball;
    }
}
