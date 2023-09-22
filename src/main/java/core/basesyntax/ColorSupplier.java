package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int color = new Random().nextInt(5);

        return Colors.values()[color] + " ball by number ";
    }
}
