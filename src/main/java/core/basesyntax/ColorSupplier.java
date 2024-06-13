package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends Ball{
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors colors = Colors.values()[index];
        setColor(colors.toString());
        return colors.toString();
    }
}
