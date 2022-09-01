package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomcolor = new ColorSupplier();
        Ball ball = new Ball(randomcolor.getRandomColor(), (int) (Math.random() * (100 + 1)));
        return ball;
    }
}
