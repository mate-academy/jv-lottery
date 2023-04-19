package core.basesyntax;

public class Lottery {
    private static final int MIN_BALL_NUMBER = 1;
    private static final int MAX_BALL_NUMBER = 100;

    public static Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        int number = (int) (Math.random()
                * (MAX_BALL_NUMBER - MIN_BALL_NUMBER + 1)) + MIN_BALL_NUMBER;
        return new Ball(color, number);
    }
}
