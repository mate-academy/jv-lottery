package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        // Інлайнінг виразу: повернення в один рядок
        return Color.values()[random.nextInt(Color.values().length)];
    }
}
