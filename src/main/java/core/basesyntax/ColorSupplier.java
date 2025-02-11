package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    public Colors getColor() {
        Random randomColor = new Random();
        Colors[] colors = Colors.values();
        int randomIndex = randomColor.nextInt(colors.length);
                return colors[randomIndex];
    }
}