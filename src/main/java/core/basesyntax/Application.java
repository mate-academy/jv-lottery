package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(random, colorSupplier);
        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
