package core.basesyntax;

public class Lottery {
    private final FigureSupplier figureSupplier = new FigureSupplier();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), figureSupplier.getRandomNumber());
    }
}
