package core.basesyntax;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(Colors.valueOf(colorSupplier.getRandomColor()), (int)(Math.random() * 100));
    }
}
