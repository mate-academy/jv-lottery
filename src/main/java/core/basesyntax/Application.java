package core.basesyntax;

public class Application {
    public static final int COUNTOFBALLS = 4;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 1; i < COUNTOFBALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
