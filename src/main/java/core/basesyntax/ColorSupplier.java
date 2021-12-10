package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String color;

    public String getRandomColor() {
        int randomColor = new Random().nextInt(Colors.values().length);
        color = Colors.values()[randomColor].toString();

        return color;
    }
}
