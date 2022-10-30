package core.basesyntax;

public class Lottery extends ColorSupplier {
    private static final int NUMBER_UPPER = 100;
    private final ColorSupplier color = new ColorSupplier();

    public Ball getRandomBall() {
        int number = (int) ((Math.random() * NUMBER_UPPER));
        return new Ball(color.getRandomColor().name(), number);
    }
}
