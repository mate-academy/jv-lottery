package core.basesyntax;

public class Lottery {
    private final ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), colorSupplier.getRandomInt());
    }
}
