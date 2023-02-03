package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        return new Ball(ColorSupplier.getRandomColor(), Random.getRandomNumber());
    }
}
