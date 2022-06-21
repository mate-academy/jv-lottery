package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random color = new Random();
        return String.valueOf(Colors.values()[color.nextInt(Colors.values().length)]);
    }
}
