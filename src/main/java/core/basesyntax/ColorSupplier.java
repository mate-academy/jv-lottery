package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    public String getRandomColor() {
        //Random randomColor = new Random();
        int index = random.nextInt(Color.values().length);
        Color[] values = Color.values();
        return values[index].toString();
    }
}
