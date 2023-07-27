package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private enum Color {
        Red,
        Blue,
        Green,
        White,
        Black,
        Orange,
        Purple
    }

    public String getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)].name();
    }
}
