package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private enum Colors {
        WHITE,
        BLACK,
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE
    }

    private final Random randomSupplier = new Random();

    public String getRandomColor() {
        // generate random int from 0 to 7 \/
        switch ((int) (randomSupplier.nextFloat() * 8)) {
            case 0:
                return Colors.WHITE.name();
            case 1:
                return Colors.BLACK.name();
            case 2:
                return Colors.RED.name();
            case 3:
                return Colors.ORANGE.name();
            case 4:
                return Colors.YELLOW.name();
            case 5:
                return Colors.GREEN.name();
            case 6:
                return Colors.BLUE.name();
            case 7:
                return Colors.PURPLE.name();
            default:
                return null;
        }
    }
}
