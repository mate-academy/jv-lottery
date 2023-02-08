package core.basesyntax;

public class Application {
    private static final int THREE = 3;
    private static final int ZERO = 0;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = ZERO; i < THREE; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
