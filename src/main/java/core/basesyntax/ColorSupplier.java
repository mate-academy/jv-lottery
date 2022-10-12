package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index =  new Random().nextInt(Ball.COLOR.values().length);
        return Ball.COLOR.values()[index] + " ";
    }
}
