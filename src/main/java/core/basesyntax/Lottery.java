package core.basesyntax;

public class Lottery {

    private static final int MIN = 1;
    private static final int SCALE = 100;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {

        Colors color = colorSupplier.getRandomColor();
        int number = (int) (Math.random() * SCALE) + MIN;

        return new Ball(color, number);
    }
}
