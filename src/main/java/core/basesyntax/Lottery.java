package core.basesyntax;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        int number = colorSupplier.getRandom().nextInt(MAX_BALL_NUMBER + 1);
        String color = colorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
