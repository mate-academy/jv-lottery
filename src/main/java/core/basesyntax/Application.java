package core.basesyntax;

public class Application {
    static final int THREE = 3;
    private static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        for (int i = 0; i < THREE; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}

