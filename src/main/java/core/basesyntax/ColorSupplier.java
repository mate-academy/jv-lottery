package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static Random random = new Random();

    public static String getRandomColor() {
        Color[] color = Color.values();
        int randomIndex = random.nextInt(color.length);
        return color[randomIndex].name();
    }
}
