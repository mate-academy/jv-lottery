import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        Color[] someColor = Color.values();
        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
