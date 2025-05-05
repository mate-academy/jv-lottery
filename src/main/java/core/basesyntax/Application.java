package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        createAndPrintRandomBalls(3);
    }

    private static void createAndPrintRandomBalls(int value) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < value; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
