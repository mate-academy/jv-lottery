package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        String color = new ColorSupplier().getRandomColor();
        Ball ball = new Ball(color, (byte)new Random().nextInt(100));

        return ball;
    }
}
