package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(String.valueOf(colorSupplier.getRandomColor()));
        Random number = new Random();
        ball.setNumber(number.nextInt(101));
        return ball;
    }
}
