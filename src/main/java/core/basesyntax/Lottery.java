package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 100;
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        Color randomColor = new ColorSupplier().getRandomColor();
        randomBall.setColor(randomColor.name());
        randomBall.setNumber(new Random().nextInt(NUMBER));
        return randomBall;
    }
}
