package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();
        Lottery lottery = new Lottery(random, supplier);
        Ball[] balls = new Ball[3];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (int i = 0; i < balls.length; i++) {
            System.out.println(balls[i].toString());
        }
    }
}
