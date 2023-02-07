package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rand = new Random();
        int number = rand.nextInt(EnumColors.values().length) + 1;
        switch (number) {
            case 1:
                return EnumColors.RED.toString();
            case 2:
                return EnumColors.BLUE.toString();
            case 3:
                return EnumColors.GREEN.toString();
            case 4:
                return EnumColors.PURPLE.toString();
            case 5:
                return EnumColors.PINK.toString();
            default:
                return "Error";
        }
    }
}
