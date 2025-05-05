package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    public String getRandomColor() {
        int randomIndex = new Random().nextInt(Color.values().length);
        Color color = Color.values()[randomIndex];
        return color.toString();
    }

}
