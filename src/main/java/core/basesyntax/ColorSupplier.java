package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color [] color = Color.values();
    private Random random = new Random();

    public String getRandomColor() {
        return color[random.nextInt(color.length)].name();
    }
}
