package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        String randomColor = Colors.values()[index].toString();
        return randomColor;
    }
}
