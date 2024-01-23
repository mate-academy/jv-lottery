package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Ball.Color.values().length);
        return Ball.Color.values()[index].toString();
    }
}
