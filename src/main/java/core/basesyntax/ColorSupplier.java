package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private Color[] values = Color.values();

    public String getRandomColor() {
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex].name();
    }
}
