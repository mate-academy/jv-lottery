package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random randomBall = new Random();

    public String getRandomColor() {
        int index = randomBall.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}
