package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private int index;
    private Random random = new Random();

    public String getRandomColor() {
        index = random.nextInt(Color.values().length);
        Color colorRandom = Color.values()[index];
        return colorRandom.name();
    }
}
