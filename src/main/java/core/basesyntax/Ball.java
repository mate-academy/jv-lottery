package core.basesyntax;

import java.util.Random;

public class Ball extends Lottery {
    private final String color = new ColorSupplier().getRandomColor().name();
    private final int number = new Random().nextInt(100);

    @Override
    public String toString() {
        return color + " ball with number " + number;
    }
}
