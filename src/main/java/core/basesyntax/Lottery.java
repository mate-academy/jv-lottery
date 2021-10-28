package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public static Ball getRandomBall() {
        String color = getRandomColor();
        Random random = new Random();
        int number = random.nextInt(100);
        return new Ball(color, number);
    }
}
