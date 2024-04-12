package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        randomBall.setColor(new ColorSupplier().getRandomColor());
        randomBall.setNumber(new Random().nextInt(100));
        System.out.println(randomBall);
        return randomBall;
    }
}
