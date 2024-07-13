package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER_BOUND = 101;
    private ColorSupplier colorSupplier;
    private Random random = new Random();

    public Lottery() {
        colorSupplier = new ColorSupplier();
    }

    private ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    private void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();

        Color randomColor = colorSupplier.getRandomColor();

        ball.setColor(randomColor);

        int num = random.nextInt(MAX_BALL_NUMBER_BOUND);
        ball.setNumber(num);

        return ball;
    }
}
