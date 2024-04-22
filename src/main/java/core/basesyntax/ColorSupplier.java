package core.basesyntax;

import java.util.Random;
// Enum for colors
enum Color {
    RED, BLUE, GREEN, YELLOW, ORANGE
}
public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index].toString();
    }
}
