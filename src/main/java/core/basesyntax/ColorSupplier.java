package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random color = new Random();

    public String getRandomColor() {
        int index = this.color.nextInt(Color.values().length);
        return Color.values()[index].name();
    }
}
