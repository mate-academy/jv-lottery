package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random randomIndexColor = new Random();

    public String getRandomColor() {
        return Colors.values()[randomIndexColor.nextInt(Colors.values().length)].name();
    }
}
