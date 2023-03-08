package core.basesyntax;
import java.util.Random;
import static java.lang.Math.random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]);
    }
}
