package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] colors = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        int randomIndex = random.nextInt(Color.values().length);
        return colors[randomIndex].name();
    }
}
