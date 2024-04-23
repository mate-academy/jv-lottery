
package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int MAX_NUMBER = 100;

    public Ball getRandomBall(){
        String color = COLOR_SUPPLIER.getRandomColor();
        int number = RANDOM.nextInt(MAX_NUMBER) + 1;
        return new Ball(color, number);
    }
}