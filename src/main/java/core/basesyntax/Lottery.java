package core.basesyntax;

public class Lottery {
    static final int LIMIT = 101;

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(),(int)(Math.random() * LIMIT));
    }
}
