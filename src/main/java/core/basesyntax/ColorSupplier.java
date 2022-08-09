package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
        }
    }
