package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int randomColor = new Random().nextInt(DiffColors.values().length);
        return DiffColors.values()[randomColor].toString();
    }
}
