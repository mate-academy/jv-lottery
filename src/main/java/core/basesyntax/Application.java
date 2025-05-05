package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        Lottery lottery = new Lottery(colorSupplier,random);
        Ball [] balls = new Ball[3];
        for (Ball ball : balls) {
            ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
