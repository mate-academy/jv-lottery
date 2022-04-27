package core.basesyntax;

import java.util.Random;

public class Lottery {

    public Ball getRandomBall() {
        int number = new Random().nextInt(100);
        Ball ball = new Ball(new ColorSupplier().getRandomColor(), number);
        return ball;
    }

}
