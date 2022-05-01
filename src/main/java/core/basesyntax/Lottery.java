package core.basesyntax;

import java.util.Random;

public class Lottery {

    public String getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(100);
        return "number - " + number + "; color - " + colorSupplier.getRandomColor() + ".";
    }
}
