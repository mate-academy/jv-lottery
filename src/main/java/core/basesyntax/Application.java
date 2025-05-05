package core.basesyntax;

import core.basesyntax.models.Ball;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(colorSupplier);

        Ball ball;
        for (int i = 0; i < 3; i++) {
            ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
