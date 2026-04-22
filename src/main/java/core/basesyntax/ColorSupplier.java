package core.basesyntax;

public class ColorSupplier {
    public enum Color {
        RED,
        BLUE,
        GREEN,
        YELLOW,
        PURPLE,
        ORANGE,
        PINK,
        BROWN,
        BLACK,
        WHITE
    }

    public Color getRandomColor() {
        Color[] color = Color.values();

        int rnd = (int) (Math.random() * color.length);

        return color[rnd];
    }
}
