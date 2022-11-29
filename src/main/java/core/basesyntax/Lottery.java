package core.basesyntax;

public class Lottery{
    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        BallNumberSupplier randomBallNumber = new BallNumberSupplier();
        Ball randomBall = new Ball(randomColor.getRandomColor(), randomBallNumber.getRandomNumber());
        return randomBall;
    }
}
