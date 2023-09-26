package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random randomIndex = new Random();

    public String getRandomColor() {
        return Color.values()[randomIndex.nextInt(Color.values().length)].name();
    }
}
