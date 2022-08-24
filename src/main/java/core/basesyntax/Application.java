package core.basesyntax;

public class Application {
    private static final int AMOUNT_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] bolls = new Ball[AMOUNT_OF_BALLS];
        for (int i = 0; i < AMOUNT_OF_BALLS; i++) {
            bolls[i] = lottery.getRandomBall();
            System.out.println(bolls[i].toString());
        }
    }
}
