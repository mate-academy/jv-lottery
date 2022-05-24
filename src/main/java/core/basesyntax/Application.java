package core.basesyntax;

import java.util.Random;

public class Application {
    static final int BALLS_NUMBER = 3;

    public static void main(String[] args) {
        for (int i = 0; i < BALLS_NUMBER; i++) {
            final Lottery ball = new Lottery(new ColorSupplier(new Random()), new Random());
            System.out.println(ball.getRandomBall());
        }
    }
}
