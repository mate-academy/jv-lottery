package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Ball.color.values().length);
        return String.valueOf(Ball.color.values()[index]);
    }
}
