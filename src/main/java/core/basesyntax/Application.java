package core.basesyntax;

public class Application {
    static final int REPETITION_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 1; i <= REPETITION_NUMBER; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
