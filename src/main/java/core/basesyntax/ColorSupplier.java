package core.basesyntax;

import java.awt.*;
import java.net.PortUnreachableException;
import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int index = new Random().nextInt(StackColor.values().length);
        return StackColor.values()[index].toString();
    }
}
