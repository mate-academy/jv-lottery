package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rd = new Random();
        int indexOfColor = rd.nextInt(Colors.values().length);
        
        return String.valueOf(Colors.values()[indexOfColor]);
    }
}
