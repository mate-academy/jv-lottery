package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_RANDOM_NUMBER = 100;

    public int getRandomBall() {
        ColorSupplier color = new ColorSupplier();
        System.out.println(color.getRandomColor());
        Random random = new Random();
        int number = random.nextInt(MAX_RANDOM_NUMBER);
        return number;
    }
}
