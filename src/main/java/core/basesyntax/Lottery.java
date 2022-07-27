package core.basesyntax;

import java.util.Random;

public class Lottery {
    public void getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int value = random.nextInt(100);
        System.out.println(colorSupplier.getRandomColor() + " " + value + " " + "\n");

    }
}
