package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Colors[] colors = Colors.values();
    private final Random random = new Random();

    public String getRandomColor() {
        int index = this.random.nextInt(this.colors.length);
        return this.colors[index].name();
    }
}
