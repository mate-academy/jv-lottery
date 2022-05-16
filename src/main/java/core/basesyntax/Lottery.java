package core.basesyntax;

public class Lottery {
    private final ColorSupplier colorSupplier ;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        return new Ball(Colors.valueOf(colorSupplier.getRandomColor()), (int)(Math.random() * 100));
    }
}
