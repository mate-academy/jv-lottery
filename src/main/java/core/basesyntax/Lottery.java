package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static void getRandomBall(Ball ball) {
        int lowerBound = 1; // minimum value of ball roll 1
        int upperBound = 101; // maximum value of ball roll 100
        Random number = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(number.nextInt(upperBound - lowerBound) + lowerBound);
    }
}
