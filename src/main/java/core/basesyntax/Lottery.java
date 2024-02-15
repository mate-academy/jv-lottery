package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random random = new Random();
        int randomint = random.nextInt(100);
        String color = new ColorSupplier().getRandomColor();
        return new Ball(color, randomint);
    }
}
