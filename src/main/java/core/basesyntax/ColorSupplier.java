package core.basesyntax;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        return String.valueOf(colors[random.nextInt(colors.length)]);
    }
}
