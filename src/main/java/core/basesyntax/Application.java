package core.basesyntax;

public class Application {
    final static int TOTAL_NUMBER_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < TOTAL_NUMBER_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
