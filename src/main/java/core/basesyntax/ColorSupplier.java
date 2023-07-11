package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    private static final int figure_Count = 8;;

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(figure_Count);
        return colors[index];
    }
}
