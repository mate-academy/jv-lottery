package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomIndex = new Random().nextInt(Color.values().length);
        return Color.values()[randomIndex].toString();
    }
}
