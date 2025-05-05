package core.basesyntax;

import java.util.Random;

class Ball {
    private Color color;
    private int number;
    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }
    public String toString() {
        return "Ball{color=" + color + ", number=" + number + '}';
    }
}

enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE;
}

public class ColorSupplier {
    public static String getRandomColor() {
        Color[] colors = Color.values();
        int randomIndex = new Random().nextInt(colors.length);
        return String.valueOf(colors[randomIndex]);
    }
}

class Lottery {
    public static Ball getRandomBall() {
        Color randomColor = Color.valueOf(ColorSupplier.getRandomColor());
        int randomNumber = new Random().nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }
}
