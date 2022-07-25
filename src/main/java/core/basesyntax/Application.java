package core.basesyntax;

public class Application {
    private static final int NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = NUMBER; i > 0; i--) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
