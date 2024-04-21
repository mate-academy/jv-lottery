package core.basesyntax;
import java.util.Random;


public class ColorSupplier {
    private static final Random random = new Random();
    public String getRandomColor() {
        Colors[] colors = Colors.values();

        return colors[random.nextInt(colors.length)].toString();
    }
}
