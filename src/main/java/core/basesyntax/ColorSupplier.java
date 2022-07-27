package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int number = new Random().nextInt(Ball.Color.values().length);
        return String.valueOf(Ball.Color.values()[number]);
    }
}
