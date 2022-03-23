package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Color color;
    private Random random = new Random();

    public Color getRandomColor() {
        switch (Color.values()[random.nextInt(Color.values().length)]) {
            case RED:
                color = Color.RED;
                break;
            case GREEN:
                color = Color.GREEN;
                break;
            case BLUE:
                color = Color.BLUE;
                break;
            case YELLOW:
                color = Color.YELLOW;
                break;
            default:
                return null;
        }
        return color;
    }
}

