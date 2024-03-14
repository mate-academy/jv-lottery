package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Color[] colors = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        int index = this.random.nextInt(this.colors.length);
        return this.colors[index].name();
    }
}
