package core.basesyntax;

public class Application {
    public static final short MAX_NUMBER_BALLS = 100;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall(MAX_NUMBER_BALLS));
        }
    }
}
