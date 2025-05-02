package core.basesyntax;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        final int Number = 3;
        final int Range = 100;
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery();
        Ball[] result = new Ball[Number];

        for (int i = 0; i < Number; i++) {
            result[i] = lottery.getRandomBall(colorSupplier.getRandomColor(), Range);
        }
        System.out.println(Arrays.toString(result));
    }
}
