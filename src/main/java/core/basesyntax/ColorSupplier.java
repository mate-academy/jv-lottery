package core.basesyntax;

import java.util.Random;

public class ColorSupplier extends colorball {

    private final int getIndex(){
        return new Random().nextInt(Color.values().length);
    }

    private final Color color = Color.values()[getIndex()];

    public Color getColor() {
        return color;
    }

    public String getRandomColor() {
        return color.name();
    }
}
