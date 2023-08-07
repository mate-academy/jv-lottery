package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

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
        int randColorNumber = RANDOM.nextInt(Color.values().length);
        return Color.values()[randColorNumber].name();
    }
}
