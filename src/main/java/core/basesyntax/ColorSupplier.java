package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public static String getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index].name();
    }

    public enum Color {
        WHITE,
        BLACK,
        BLUE,
        PURPLE,
        PINK
    }
}
