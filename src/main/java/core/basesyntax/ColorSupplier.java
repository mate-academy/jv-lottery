package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    
    public Colour getRandomColor() {
        int index = random.nextInt(Colour.values().length);
        return Colour.values()[index];
    }
}
