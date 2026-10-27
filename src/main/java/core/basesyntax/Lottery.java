package core.basesyntax;

public class Lottery extends ColorSupplier {

    private static final int MAX_NUMBER = 101;

    public Ball getRandomBall() {
        int indexNumber = ColorSupplier.RANDOM.nextInt(MAX_NUMBER);
        return new Ball(getRandomColor(), indexNumber);
    }
}
