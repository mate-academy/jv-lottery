package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor(){
        return String.valueOf(Colors.values()[new Random().nextInt(Colors.values().length)]);
    }
}
