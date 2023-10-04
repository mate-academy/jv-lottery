package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final String[] colors = new String[]{"red","blue","green","black","white"};
    public String getRandomColor() {
        Random rand = new Random();
        return colors[rand.nextInt(colors.length)];
    }
}
