package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random rand = new Random();

        int choice = rand.nextInt(3);

        switch (choice) {
            case 0:
                return Colors.RED.toString();
            case 1:
                return Colors.GREEN.toString();
            case 2:
                return Colors.BLUE.toString();
        }
        return "";
    }
}
