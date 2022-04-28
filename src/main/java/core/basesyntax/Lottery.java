package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        int number = Application.random.nextInt(Application.maxLimit);
        Ball ball = new Ball(Application.colorSupplier.getRandomColor(), number);
        return ball;
    }
}
