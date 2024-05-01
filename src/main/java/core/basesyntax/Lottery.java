package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static void getRandomBall(Ball ball) {
        ColorSupplier colorSupplier = new ColorSupplier();
        ball.setColor(String.valueOf(colorSupplier.getRandomColor()));
        Random number = new Random();
        ball.setNumber(number.nextInt(101));
    }
}
