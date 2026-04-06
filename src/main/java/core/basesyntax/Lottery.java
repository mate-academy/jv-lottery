package core.basesyntax;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomBall() {
        Ball ball = new Ball(colorSupplier.getRandomColor(), colorSupplier.getRandomNumber());
        return ball.toString();
    }
}
