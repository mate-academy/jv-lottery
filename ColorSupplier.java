import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();
    public Color getRandomColor() {
       int index = random.nextInt(Color.values().length);
       return Color.values()[index];
    }
}