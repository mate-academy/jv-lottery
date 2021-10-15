package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int COUNT = 3;

    public static void main(String[] args) {

        Random random = new Random();
        Lottery lottery = new Lottery();
        ColorSupplier colorSupplier = new ColorSupplier();
        Ball[] ball = new Ball[COUNT];
        for (int i = 0; i < ball.length; i++) {
            ball[i] = lottery.getRandomBall();
            System.out.println(ball[i]);
        }
    }
}
