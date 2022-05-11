package core.basesyntax;

public class Application {
    private static final int NUMBEROFBALLS = 3;
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUMBEROFBALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
