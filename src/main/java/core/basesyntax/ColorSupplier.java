package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random random = new Random();
    
    public String getRandomColor() {
        int randomColorIndex = random.nextInt(Color.values().length);
        return Color.values()[randomColorIndex].name();
    }
}
