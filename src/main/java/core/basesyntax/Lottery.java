package core.basesyntax;

import java.util.Random;

public class Lottery {
    static final int MAX_BALL_NUMBER = 100;
    private Random randomNumber = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Ball getRandomBall() {
        int ballNumber = randomNumber.nextInt(MAX_BALL_NUMBER);
        Color ballColor = randomColor.getRandomColor();
        return new Ball(ballColor.toString(), ballNumber);
    }
}
