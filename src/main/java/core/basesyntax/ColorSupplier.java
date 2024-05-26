package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public enum Color {
        RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, BLACK, WHITE
    }

    public String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        int index = random.nextInt(8);
        String randomColor = String.valueOf(colors[index]);
        return randomColor;
    }
}
