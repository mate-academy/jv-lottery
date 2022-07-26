package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static int count = 99;
    private Random random = new Random();

    public Object getRandomBall(String color) {
        int numberOfBall = random.nextInt(count) + 1;
        Ball ball = new Ball(color,numberOfBall);
        return ball;
    }
}
