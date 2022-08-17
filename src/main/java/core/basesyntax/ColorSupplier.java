package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private String color;

    public String getRandomColor() {
        color = Color.values()[new Random().nextInt(Color.values().length)].name();
        return color;
    }
}
