package core.basesyntax;

import ball.lottery.Colors;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int id = random.nextInt(Colors.values().length);
        return Colors.values()[id].toString();
    }
}
