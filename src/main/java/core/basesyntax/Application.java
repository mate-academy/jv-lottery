package core.basesyntax;

public class Application {
    public static final int MAGIC_NUMBER = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < MAGIC_NUMBER; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
