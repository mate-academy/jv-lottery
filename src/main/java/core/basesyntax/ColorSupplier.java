package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static int randomNumber = new Random().nextInt(Color.values().length);
    public String getRandomColor() {
        return Color.values()[randomNumber].name();
    }
}
