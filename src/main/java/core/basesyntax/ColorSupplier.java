package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int randomIndexOfColor = random.nextInt(Colors.values().length);
        return Colors.values()[randomIndexOfColor].toString();
    }
}
