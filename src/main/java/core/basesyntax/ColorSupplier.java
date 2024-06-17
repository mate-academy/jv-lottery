package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        Colours[] colour = Colours.values();
        int randomIndex = random.nextInt(colour.length - 1);

        return String.valueOf(colour[randomIndex]);
    }
}
