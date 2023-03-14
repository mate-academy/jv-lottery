package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static Ball getRandomBall() {
        Random random = new Random();
        int number = random.nextInt(100);
        String color = String.valueOf(ColorSupplier.getRandomColor());
        return new Ball(color, number);
    }
}
