package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = new String[]{"white", "black", "red", "blue"};
    private final Random rand = new Random();

    public String getRandomColor() {
        return colors[rand.nextInt(colors.length)];
    }
}
