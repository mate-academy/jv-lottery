package core.basesyntax;

public class Application {
    private static final int BALLS_COUNT = 3; // Використання константи замість magic number

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        System.out.println("--- LOTTERY DRAW ---");

        // Використання for-loop для створення кількох об'єктів
        for (int i = 0; i < BALLS_COUNT; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println("Draw " + (i + 1) + ": " + ball);
        }
    }
}
