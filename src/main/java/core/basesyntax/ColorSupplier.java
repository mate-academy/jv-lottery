package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    private static final Random random = new Random();
    public static String getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex].toString();
    }
}
