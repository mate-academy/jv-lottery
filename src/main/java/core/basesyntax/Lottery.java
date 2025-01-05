package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static final int MAX_VALUE = 100;

    private final ColorSupplier colorSupplier = new ColorSupplier();

    private final Random random = new Random();

    public int getRandomBall() {
        System.out.println(colorSupplier.getRandomColor());
        int number = random.nextInt(MAX_VALUE);
        return number;
    }

}
