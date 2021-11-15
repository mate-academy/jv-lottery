package core.basesyntax;


public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier supplier = new ColorSupplier();
        Color color = supplier.getRandomColor();
        Ball ball = new Ball(color, RandomIndex.getRandomIndex(100));
        return ball;
    }
}
