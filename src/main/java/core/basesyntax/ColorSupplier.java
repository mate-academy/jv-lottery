package core.basesyntax;
import java.util.Random;
class ColorSupplier {
    public static String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        return colors[random.nextInt(colors.length)].toString();
    }
}
