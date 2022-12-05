package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        BallNumberSupplier randomBallNumber = new BallNumberSupplier();
        return new Ball(randomColor.getRandomColor(), randomBallNumber.getRandomNumber());
    }
}
