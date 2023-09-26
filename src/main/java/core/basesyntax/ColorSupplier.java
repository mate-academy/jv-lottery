package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(ColorEnum.values().length);
        return ColorEnum.values()[index].name();
    }
}
//
//    Random random = new Random();
//    int index = random.nextInt(Colors.values().length);
//    String color = String.valueOf(Colors.values()[index]);
//         return color;