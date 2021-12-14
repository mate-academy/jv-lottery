package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random = new Random();

    public String getRandomColor() {
        int value = random.nextInt(Color.values().length);
        String color = Color.values()[value].toString();
        return color;
    }
}
