import java.util.Random;

public enum Color {
    RED, BLUE, GREEN, YELLOW, ORANGE;

    private static final Random random = new Random();

    public static Color getRandomColor() {
        return values()[random.nextInt(values().length)];
    }
}