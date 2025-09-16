package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        switch (choice) {
            case 0:
                return Colors.RED;
            case 1:
                return Colors.GREEN;
            case 2:
                return Colors.BLUE;
            default:
                return Colors.RED;
        }
    }
}
