package core.basesyntax;

public class Application {

    private static int NEW_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < NEW_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
