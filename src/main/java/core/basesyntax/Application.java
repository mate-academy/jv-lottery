package core.basesyntax;

public class Application {
    private static final int taskIterAmount = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < taskIterAmount; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
