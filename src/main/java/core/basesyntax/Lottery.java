package core.basesyntax;

public class Lottery {

    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int RANDOM_BOUND = 101;

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = ColorSupplier.random.nextInt(RANDOM_BOUND);
        return new Ball(randomColor, randomNumber);
    }
}
