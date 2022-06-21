package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    int randomNumberOfColor = new Random().nextInt(Color.values().length);
    public String getRandomColor() {
        return Color.values()[randomNumberOfColor].name();
    }
}