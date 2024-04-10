package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Colors randomColor = ColorSupplier.getRandomColor();
        Random someRandomBall = new Random();
        int randomBall = someRandomBall.nextInt(101);
        return new Ball(randomColor, randomBall);
    }
}