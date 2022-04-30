package core.basesyntax;

public class Application {
    public static final int ATTEMPTS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < ATTEMPTS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
