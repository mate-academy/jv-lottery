package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private int AMOUNT_OF_COLORS = Color.values().length;
    
    private Random random = new Random();
    
    public String getRandomColor() {
        return Color.values()[random.nextInt(AMOUNT_OF_COLORS)].name();
    }
}
