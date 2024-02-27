package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static String getRandomBall() {
        int ballIndex = new Random().nextInt(100);
        Ball ball = new Ball(getRandomColor(), ballIndex);
        return ball.toString();
    }
}
