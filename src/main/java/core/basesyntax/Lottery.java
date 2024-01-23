package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        String color = ColorSupplier.getRandomColor();
        return new Ball(color, number);

    }
}
