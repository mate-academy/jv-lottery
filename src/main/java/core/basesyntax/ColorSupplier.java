package core.basesyntax;

import java.util.List;
import java.util.Random;

public class ColorSupplier {
    private static final List<Color> VALUES = List.of(Color.values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        return VALUES.get(RANDOM.nextInt(SIZE)).toString();
    }
}
