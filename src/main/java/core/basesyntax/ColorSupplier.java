package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Random RANDOM = new Random();

    public String getRandomColor() {
        int randomIndex = RANDOM.nextInt(Color.values().length);
        return Color.values()[randomIndex].toString();
    }
}
