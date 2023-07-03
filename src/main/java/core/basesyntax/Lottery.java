package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor();
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return new Ball(number, color);
    }
}
