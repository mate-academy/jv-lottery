package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;
    private static final Lottery lottery1 = new Lottery();

    public static void main(String[] args) {
        Lottery[] lottery = new Lottery[NUMBER_OF_BALLS];
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = lottery1.getRandomBall();
            printResult(lottery[i]);
        }

    }

    public static void printResult(Lottery lottery) {
        System.out.println(lottery.toString());
    }
}
