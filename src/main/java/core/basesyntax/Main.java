package core.basesyntax;

import java.util.Random;

enum Color {
    RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE
}

class Ball {
    private final Color color;
    private final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }


    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", number=" + number +
                '}';
    }
}

class ColorSupplier {
    public static Color getRandomColor() {
        Color[] colors = Color.values();
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}

class Lottery {
    public static Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        return new Ball(randomColor, randomNumber);
    }

    public static void main(String[] args) {
        // Создаем три шара с помощью метода getRandomBall() из класса Lottery
        Ball ball1 = getRandomBall();
        Ball ball2 = getRandomBall();
        Ball ball3 = getRandomBall();

        // Выводим информацию о шарах в консоль
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
