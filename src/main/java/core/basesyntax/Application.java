package core.basesyntax;

public class Application {
    public static final int QUANTITY_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < QUANTITY_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
