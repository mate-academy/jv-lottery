package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final int lengthOfEnum = Color.values().length;
    private int index = new Random().nextInt(lengthOfEnum);

    public String getRandomColor() {
        return Color.values()[index].toString().toLowerCase();
    }
}
