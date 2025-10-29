package core.basesyntax;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Color color = colorSupplier.getRandomColor();
        int number = colorSupplier.getRandomInt();
        Ball ball = new Ball(color, number);
        return ball;
    }
}
