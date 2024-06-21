package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int BALLS_LIMIT = 3;
        Lottery lottery = new Lottery();
        for (int i = 0; i < BALLS_LIMIT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
