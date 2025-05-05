package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ColorSupplier color = new ColorSupplier();
        color.getRandomColor();
        Random number = new Random();
        number.nextInt(100);
        return ball;
    }
}
