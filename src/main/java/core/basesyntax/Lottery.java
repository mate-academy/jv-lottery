package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randBall = new Ball();
        randBall.color = new ColorSupplier().getRandomColor();
        randBall.number = new Random().nextInt(100);
        return randBall;
    }
}
