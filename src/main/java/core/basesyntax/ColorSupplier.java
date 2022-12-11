package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {

    public Color getRandomColor() {

        int index = random.nextInt(Color.values().length);
        return Color.values()[index];
    }
}
