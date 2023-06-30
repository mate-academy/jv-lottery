package core.basesyntax;

public class Application {
    private static final int MAX_INDEX = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < MAX_INDEX; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
