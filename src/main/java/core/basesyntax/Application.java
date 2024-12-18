package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int ballsToCreate = 3;
        int numberRange = 100;
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery();
        Ball[] result = new Ball[ballsToCreate];

        for (int i = 0; i < ballsToCreate; i++) {
            result[i] = lottery.getRandomBall(colorSupplier.getRandomColor(), numberRange);
        }
        System.out.println(Arrays.toString(result));
    }
}
