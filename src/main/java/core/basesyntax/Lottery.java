package core.basesyntax;

public class Lottery {
    private BallColorSupplier colorSupplier = new BallColorSupplier();
    private BallNumberSupplier numberSupplier = new BallNumberSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), numberSupplier.getRandomNumber());
    }
}
