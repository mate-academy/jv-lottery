package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random numberOfColor = new Random();
        return Colors.values()[numberOfColor.nextInt(Colors.values().length)].name();
    }
}
