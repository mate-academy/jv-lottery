package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER = 99;
    private Random random = new Random();

    public Ball getRandomBall(String color) {
        int numberOfBall = random.nextInt(NUMBER) + 1;
        return new Ball(color,numberOfBall);
    }
}
