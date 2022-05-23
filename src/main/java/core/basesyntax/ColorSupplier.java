package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String color;
    private Random randomColor = new Random();

    public String getRandomColor() {
        int index = randomColor.nextInt(Color.values().length);
        return color = String.valueOf(Color.values()[index]);
    }
}
