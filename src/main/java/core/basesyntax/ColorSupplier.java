package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Colors [] colors = Colors.values();//array of colors
        int pick = new Random().nextInt(colors.length);//choose a random index from colors

        return colors[pick].toString();//our random color
    }
}

