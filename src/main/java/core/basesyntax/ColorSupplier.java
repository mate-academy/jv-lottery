package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    int index = new Random().nextInt(Ball.Color.values().length);

    public Ball.Color getRandomColor() {
        return Ball.Color.values()[index];
    }
}
