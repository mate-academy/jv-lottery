package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        Lottery lottery = new Lottery(random, new ColorSupplier(random));
        Ball[] balls = new Ball[3];
        for (int i = 0; i < 3; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(i + " ball: " + balls[i]);
        }
    }
}
