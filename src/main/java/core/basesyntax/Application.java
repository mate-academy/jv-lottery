package core.basesyntax;

public class Application {
    public static final int COUNT_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < COUNT_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
