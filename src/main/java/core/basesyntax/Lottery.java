package core.basesyntax;

import java.util.Random;

public class Lottery {
    public String getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int number = new Random().nextInt(100);

        return randomColor + number;
    }
}

