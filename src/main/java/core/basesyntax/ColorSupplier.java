package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private static Random random = new Random();
    public static Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }
}
class Lottery {
    public static Ball getRandomBall() {
        Color color = ColorSupplier.getRandomColor();
        int number = new Random().nextInt(100) + 1;
        return new Ball(color, number);
    }
}


