package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        int number = new Random().nextInt(101);
        Ball randomBall = new Ball(new ColorSupplier().getRandomColor(), number);
        return  randomBall;
    }
}

