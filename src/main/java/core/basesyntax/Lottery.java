package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random number = new Random();
    int value = number.nextInt(101);
    ColorSupplier color = new ColorSupplier();

    String getRandomBall() {
        return color.getRandomColor() + " " + value;
    }
}
