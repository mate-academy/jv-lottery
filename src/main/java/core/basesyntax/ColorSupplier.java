package core.basesyntax;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex].toString();
    }
}
