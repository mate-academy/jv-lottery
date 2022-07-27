package core.basesyntax;

import java.util.Random;

public enum Color {
    WHITE, GOLD, SILVER, ORANGE, GREY, LIGHTGREY, DARKGREY, BLACK;

    public static Color getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
