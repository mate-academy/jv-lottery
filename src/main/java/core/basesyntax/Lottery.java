package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_RANGE = 100;

    private int getRandomNumber() {
        return new Random().nextInt(BALL_NUMBER_RANGE);
    }

    private String getRundomColor() {
        return new ColorSupplier().getRandomColor();
    }

    public Ball getRandomBall() {
        String color = this.getRundomColor();
        int number = this.getRandomNumber();
        return new Ball(color, number);
    }
}
