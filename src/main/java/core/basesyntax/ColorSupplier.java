package core.basesyntax;
import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Color[] colors = Color.values();
        int index = new Random().nextInt(colors.length);
        return colors[index].toString();
    }
}
