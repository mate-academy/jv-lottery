package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colore.values().length);
        Colore color = Colore.values()[index];
        return color.toString();
    }
}
