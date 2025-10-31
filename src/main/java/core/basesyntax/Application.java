package core.basesyntax;

public class Application {
    private static final int NUMBERS_OF_TICKETS = 3;

    public static void main(String[] args) {

        Lottery lottery = new Lottery();
        Lottery[] tickets = new Lottery[NUMBERS_OF_TICKETS];

        for (int i = 0; i < tickets.length; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
