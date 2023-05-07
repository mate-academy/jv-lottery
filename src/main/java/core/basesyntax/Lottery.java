package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static String getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        Ball ball = new Ball(getRandomColor(), value);
        return ball.toString();
    }
}
