package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    
    public String getRandomColor() {
        ColorEnum[] colors = ColorEnum.values();
        return colors[random.nextInt(colors.length)].toString();
    }
}
