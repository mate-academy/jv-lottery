package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        Random number = new Random();
        int value = number.nextInt(100);

        ColorSupplier color = new ColorSupplier();
        Ball ball = new Ball(color.getRandomColor(), value);
        return ball.toString();
    }
}
