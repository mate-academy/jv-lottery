package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 4;

    public String getRandomColor() {
        Random rand = new Random();
        int colorIdx = rand.nextInt(COLOR_COUNT) + 1;
        switch (colorIdx) {
            case 1:
                return Color.YELLOW.name();
            case 2:
                return Color.RED.name();
            case 3:
                return Color.BLUE.name();
            case 4:
                return Color.BLACK.name();
            default:
                System.out.println(colorIdx);
                return "Sorry, none such color.";
        }
    }
}
