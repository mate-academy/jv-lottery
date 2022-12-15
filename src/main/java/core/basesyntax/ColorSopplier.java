package core.basesyntax;

import java.util.Random;

public class ColorSopplier {

    public Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}

