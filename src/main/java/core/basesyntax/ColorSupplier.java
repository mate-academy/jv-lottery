package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Сolors getRandomColor() {
        int index = new Random().nextInt(Сolors.values().length);
        Random randomColor = new Random();
        return Сolors.values()[index];
    }
}

