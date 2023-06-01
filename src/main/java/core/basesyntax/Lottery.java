package core.basesyntax;

public class Lottery {
    ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(this.colorSupplier.getRandomColor());
    }
}
