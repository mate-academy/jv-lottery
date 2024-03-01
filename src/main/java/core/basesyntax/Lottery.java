package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        Ball ball = new Ball();
        int value = random.nextInt(100);
        System.out.println(value);
        return ball;
    }
}
