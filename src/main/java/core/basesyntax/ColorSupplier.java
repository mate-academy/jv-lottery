package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color.GetColor getRandomColor() {
        int index = new Random().nextInt(Color.GetColor.values().length);
        return Color.GetColor.values()[index];
    }

}
