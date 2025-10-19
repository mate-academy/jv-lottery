package core.basesyntax;

public class Application { // Або Application
    private static final int BALLS_COUNT = 3; // Виправлення #8: Константа

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        System.out.println("--- LOTTERY DRAW ---");

        // Виправлення #7: Використання for-loop
        for (int i = 0; i < BALLS_COUNT; i++) {
            Ball ball = lottery.getRandomBall();
            // Ми виводимо "Draw 1:", "Draw 2:" і т.д.
            System.out.println("Draw " + (i + 1) + ": " + ball);
        }
    }
}
