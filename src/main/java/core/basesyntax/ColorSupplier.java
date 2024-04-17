package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();
    private static final Colors[] COLORS = Colors.values();
    
    public static Colors getRandomColor() {
        int RandomIndex = RANDOM.nextInt(COLORS.length);
        return COLORS[RandomIndex];
    }
}
