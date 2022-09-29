package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(new Random(), new ColorSupplier());
        Ball[] balls = new Ball[4];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
            System.out.println(balls[i]);
        }
    }
}
