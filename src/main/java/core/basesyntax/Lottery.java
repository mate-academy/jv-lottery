package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAXNUMBER = 100;
    private Random number = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setNumber(getRandomNumber());
        ball.setColor(String.valueOf(colorSupplier.getRandomColor()));
        return ball;
    }

    private int getRandomNumber() {
        int value = number.nextInt(MAXNUMBER);
        return value;
    }
}
