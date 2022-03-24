package core.basesyntax;

import java.util.Random;

public class Lottery extends Ball {
    public static Ball getRandomBall() {
        String color = ColorSupplier.getRandomColor();
        Random random = new Random();
        int number = random.nextInt(100);
        return new Ball(color,number);
    }
}
