package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random randomService = new Random();
    private static final Color[] COLORS = Color.values();

    public String getRandomColor() {
        int randomIndex = randomService.nextInt(COLORS.length);
        return COLORS[randomIndex].name();
    }
}
