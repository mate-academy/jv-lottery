package core.basesyntax;

public class Application {
    public static final int COUNT_OF_BALLS = 4;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 1; i < COUNT_OF_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
