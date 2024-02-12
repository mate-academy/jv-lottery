package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static final int AMOUNT_OF_COLORS = Color.values().length;
    
    private Random random = new Random();
    
    public String getRandomColor() {
        return Color.values()[random.nextInt(AMOUNT_OF_COLORS)].name();
    }
}
