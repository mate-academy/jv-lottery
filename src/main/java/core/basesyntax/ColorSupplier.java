package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Colors[] colors = Colors.values();

    public String getRandomColor() {
        return this.colors[this.random.nextInt(this.colors.length)].name();
    }
}
