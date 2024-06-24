package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int index = new Random().nextInt(Ball.Color.values().length);
        return String.valueOf(Ball.Color.values()[index]);
    }
}
