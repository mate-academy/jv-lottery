package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private Random random = new Random();

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        String color = String.valueOf(Color.values()[index]);
        return color;
    }
}
