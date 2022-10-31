package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUMBER_RANGE = 100;
    private String color = this.getRundomColor();
    private int number = this.getRandomNumber();

    private int getRandomNumber() {
        return new Random().nextInt(BALL_NUMBER_RANGE);
    }

    private String getRundomColor() {
        return new ColorSupplier().getRandomColor();
    }

    public Ball getRandomBall() {
        return new Ball(color, number);
    }
}
