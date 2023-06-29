package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randomColor = new ColorSupplier();
        Ball randomlyBall = new Ball();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(100); i++) {
            randomlyBall.setColor(randomColor.getRandomColor());
            randomlyBall.setNumber(randomColor.getRandomColor().length());
        }
        return randomlyBall;
    }
}
