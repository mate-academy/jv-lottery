package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final Random RANDOM = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    private final int max = 100;

    public int getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        System.out.println(color.getRandomColor());
        Random random = new Random();
        int number = random.nextInt(max);
        return number;
    }
}
