package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random number = new Random();
        ColorSupplier color = new ColorSupplier();
        Ball ball = new Ball(number.nextInt(100), color.getRandomColor());
        return ball;
    }
}
