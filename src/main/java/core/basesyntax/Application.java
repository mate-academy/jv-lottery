package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        final int BALLS_TO_CREATE = 3;
        final int NUMBER_RANGE = 100;
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery();
        Ball[] result = new Ball[BALLS_TO_CREATE];

        for (int i = 0; i < BALLS_TO_CREATE; i++) {
            result[i] = lottery.getRandomBall(colorSupplier.getRandomColor(), NUMBER_RANGE);
        }
        System.out.println(Arrays.toString(result));
    }
}
