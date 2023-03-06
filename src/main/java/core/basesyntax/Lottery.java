package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        Random random = new Random();
        int number = random.nextInt(100);
        ball.setNumber(number);
        ball.getNumber();
        ColorSupplier csp = new ColorSupplier();
        String color = csp.getRandomColor();
        ball.setColor(color);
        ball.getColor();
        return ball;
    }
}
