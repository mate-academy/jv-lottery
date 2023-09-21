package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    //TODO probably we need to implement toString() from Ball.java somehow...
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color.name();
    }
}
