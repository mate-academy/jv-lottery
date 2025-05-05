package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier color = new ColorSupplier(random);
        Lottery lottery = new Lottery(random, color);
        Ball[] balls = new Ball[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
