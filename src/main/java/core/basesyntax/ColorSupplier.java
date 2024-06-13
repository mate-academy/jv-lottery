package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball{
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors ballColor = Colors.values()[index];
        String color = ballColor.name();
        return color;
    }
}
