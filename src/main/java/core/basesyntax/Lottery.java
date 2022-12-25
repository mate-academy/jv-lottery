package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    static final int LIMITNUMBER = 100;

    public Ball getRandomBall() {
        int number = random.nextInt(LIMITNUMBER);
        String color = colorSupplier.getRandomColor();
        Ball ball = new Ball();
        ball.setColor(color);
        ball.setNumber(number);
        return ball;
    }
}