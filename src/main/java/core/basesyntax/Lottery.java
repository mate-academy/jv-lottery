package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class Lottery extends Ball{
    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball(random.nextInt(101), new ColorSupplier().getRandomColor());
        return ball;
    }
}
