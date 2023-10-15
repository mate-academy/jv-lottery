package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    enum Colors {
        BLUE, YELLOW, GREEN, BLACK, PURPLE;

        public static Colors getRandomColor() {
            Colors[] colors = Colors.values();
            Random random = new Random();
            return colors[random.nextInt(colors.length)];
        }
    }

    static class Ball {
        private final Colors color;

        private final int number;

        public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
        }

        @Override
        public String toString() {
            return "A " +  color + " Ball, with a number=" + number;
        }
    }

    static class Lottery {
        private static final int maxNumber = 100;

        private final Random random;

        public Lottery(){
            this.random = new Random();
        }

        public Ball getRandomBall() {
            Colors color = Colors.getRandomColor();
            int number = random.nextInt(maxNumber) + 1;
            return new Ball(color, number);
        }
    }
}
