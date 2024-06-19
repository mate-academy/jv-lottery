package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index;

    public void setIndex() {
        this.index = new Random().nextInt(Color.values().length);
    }

    public String getRandomColor() {
        setIndex();
        Color[] color = Color.values();
        return color[index].name();
    }
}
