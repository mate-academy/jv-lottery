package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int numRandColor = random.nextInt(7);
        String str = null;

        switch (numRandColor) {
            case 1:
                str = String.valueOf(Colors.BLACK);
                break;
            case 2:
                str = String.valueOf(Colors.BLUE);
                break;
            case 3:
                str = String.valueOf(Colors.RED);
                break;
            case 4:
                str = String.valueOf(Colors.ORANGE);
                break;
            case 5:
                str = String.valueOf(Colors.GREEN);
                break;
            case 6:
                str = String.valueOf(Colors.GREY);
                break;
            default:
                str = String.valueOf(Colors.YELLOW);
                break;
        }
        return str;
    }
}
