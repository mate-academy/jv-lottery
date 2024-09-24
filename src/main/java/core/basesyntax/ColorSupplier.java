package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Ball.Color getRandomColor() {
        int index = new Random().nextInt(Ball.Color.values().length);
        return Ball.Color.values()[index];
    }
}
