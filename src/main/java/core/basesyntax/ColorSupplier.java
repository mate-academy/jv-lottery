package core.basesyntax;
import java.util.Random;

public class ColorSupplier {
    public enum Colors {
    RED,
    YELLOW,
    WHITE,
    BLACK,
    BLUE
} 
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color.name();
    }
}
