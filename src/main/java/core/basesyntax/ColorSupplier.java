package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int randomNumberColor = new Random().nextInt(Color.values().length);

    public String getRandomColor() {
        return Color.values()[randomNumberColor].toString();
    }
}
