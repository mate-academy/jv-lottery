package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_BALL_NUMBER = 100;
    private final ColorSupplier colorSupplier;

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        int ballNumber = new Random().nextInt(MAX_BALL_NUMBER) + 1;
        String ballColor = colorSupplier.getRandomColor().name();
        return new Ball(ballColor, ballNumber);
    }
}


