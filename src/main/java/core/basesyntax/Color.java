package core.basesyntax;

import java.util.Random;

public enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE;

    public static Color getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = new Random().nextInt(colors.length);
        return colors[randomIndex];
    }
}
