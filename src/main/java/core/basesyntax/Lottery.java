package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        Random number = new Random();
        Ball ball = new Ball(color.getRandomColor(), number.nextInt(100));
        return ball.toString();
    }
}
