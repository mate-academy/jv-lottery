
package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static Random randomNumber = new Random();
    private static ColorSupplier randomColorSupplier = new ColorSupplier();

    public static Ball getRandomBall() {
        int number = randomNumber.nextInt(100);
        String color = randomColorSupplier.getRandomColor();
        return new Ball(color, number);
    }
}
