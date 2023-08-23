package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        listOfColors[] colors = listOfColors.values();
        int indexOfColor = new Random().nextInt(colors.length);
        return colors[indexOfColor].toString();

    }
    public int getRandomINum() {
        Random random = new Random();
        int randomNum = random.nextInt(101);
        return randomNum;

    }

}
