package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(colorSupplier);
        final int NUMBER_OFBALLS = 3;
        Ball[] balls = new Ball[NUMBER_OFBALLS];

        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
