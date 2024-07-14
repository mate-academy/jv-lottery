package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final String[] COLORS = {"Red", "Green", "Blue", "Yellow", "Black"};

    public String getRandomColor() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}
