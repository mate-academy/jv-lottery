package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    public String getRandomColor() {
        int indexRandom = random.nextInt(Color.values().length);
        Color colors = Color.values()[indexRandom];
        return colors.name();
    }
}
