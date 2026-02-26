import java.util.Random;

public class Lottery {

    public enum Color {
        GREEN, BLUE, PURPLE, WHITE, BLACK, YELLOW, ORANGE
    }

    public static class ColorSupplier {
        private final Random random = new Random();

        public String getRandomColor() {
            Color[] colors = Color.values();
            return colors[random.nextInt(colors.length)].name();
        }
    }

    public static class Ball {
        private final String color;
        private final int number;

        public Ball(String color, int number) {
            this.color = color;
            this.number = number;
        }

        @Override
        public String toString() {
            return "Ball: " + color + ", number: " + number;
        }
    }

    public static class Lottery {
        private final ColorSupplier colorSupplier = new ColorSupplier();
        private final Random random = new Random();
        private static final int MAX_NUMBER = 100;

        public Ball getRandomBall() {
            return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER + 1));
        }
    }

    private static final int DRAW_COUNT = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        System.out.println("Drawing " + DRAW_COUNT + " balls:");

        for (int i = 1; i <= DRAW_COUNT; i++) {
            System.out.println("Draw number:" + i + lottery.getRandomBall());
        }
    }
}
