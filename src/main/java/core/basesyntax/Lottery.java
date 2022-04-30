package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(Colors.valueOf(colorSupplier.getRandomColor()), (int)(Math.random() * 100));
    }
}
