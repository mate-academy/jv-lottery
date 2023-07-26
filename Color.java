import java.util.Random;

public enum Color {
    RED, BLUE, GREEN, YELLOW, ORANGE;
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }
}
