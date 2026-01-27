package core.basesyntax;

public class Application {
    private static final int BALL_COUNT = 3; // Константа для кількості ітерацій

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < BALL_COUNT; i++) {
            // Виводимо інформацію про випадкову кульку в консоль
            System.out.println(lottery.getRandomBall());
        }
    }
}
