package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAXNUMBER = 100;
    private Random number = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setNumber(getRandomNumber());
        ball.setColor(String.valueOf(new ColorSupplier().getRandomColor()));
        return ball;
    }

    private int getRandomNumber() {
        int value = number.nextInt(MAXNUMBER);
        return value;
    }
}
