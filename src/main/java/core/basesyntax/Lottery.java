package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        BallNumberSupplier randomBallNumber = new BallNumberSupplier();
        Ball newBall = new Ball(randomColor.getRandomColor(), randomBallNumber.getRandomNumber());
        return newBall;
    }
}
