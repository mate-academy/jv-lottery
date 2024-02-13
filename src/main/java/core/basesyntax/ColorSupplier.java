package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private int amountOfColors = Color.values().length;
    
    private Random random = new Random();
    
    public String getRandomColor() {
        return Color.values()[random.nextInt(amountOfColors)].name();
    }
}
