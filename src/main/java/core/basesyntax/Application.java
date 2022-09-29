package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(new Random(), new ColorSupplier());
        Ball[] balls = new Ball[4];
        for (int i = 0; i < 4; i++) {
            balls[i] = lottery.getRandomBall();
        }
        for (Ball ball: balls) {
            System.out.println(ball);
        }
    }
}
