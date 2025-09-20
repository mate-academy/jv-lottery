package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int amountOfColors = Color.values().length;
        int index = new Random().nextInt(amountOfColors);
        Color color = Color.values()[index];
        return color.toString();
    }
}
