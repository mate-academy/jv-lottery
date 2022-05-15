package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random randomColor = new Random();
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}