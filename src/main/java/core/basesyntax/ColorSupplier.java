package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    public String getRandomColor() {
        int bound = Colour.values().length;
        int index = random.nextInt(bound);
        switch (index) {
            case (0): return Colour.BLACK.name();
            case (1): return Colour.RED.name();
            case (2): return Colour.PURPLE.name();
            case (3): return Colour.GREEN.name();
            default: return Colour.WHITE.name();
        }
    }
}
