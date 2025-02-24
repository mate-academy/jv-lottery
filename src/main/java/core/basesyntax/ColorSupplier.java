package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int number = random.nextInt(1, 4);
        if (number == 1) {
            return Colors.RED.getColor();
        } else if (number == 2) {
            return Colors.BLUE.getColor();
        } else {
            return Colors.GREEN.getColor();
        }
    }
}
