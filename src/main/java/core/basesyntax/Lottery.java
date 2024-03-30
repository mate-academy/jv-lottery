package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier color = new ColorSupplier();

    public String getRandomBall() {
        int number = new Random().nextInt(100);
        return new Ball(color.getRandomColor(),Integer.valueOf(number).toString()).toString();
    }
}
