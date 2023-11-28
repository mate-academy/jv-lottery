package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[new Random().nextInt(colors.length)].toString();
    }

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        System.out.println("Random Color: " + colorSupplier.getRandomColor());
    }

    public enum Color {
        RED, BLUE, GREEN, YELLOW, ORANGE, PURPLE;
    }
}
