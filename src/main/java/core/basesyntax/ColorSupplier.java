package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colores getRandomColor() {
        int index = new Random().nextInt(Colores.values().length);
        return Colores.values()[index];
    }
}
