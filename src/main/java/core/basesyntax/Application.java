package core.basesyntax;

public class Application {
    private static final int balls = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < balls; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
