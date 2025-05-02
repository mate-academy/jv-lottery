package core.basesyntax;

public class Application {
    private static final int NUMBERS_OF_LOTTERY_BALLS = 3;

    public static void main(String[] args) {

        System.out.println("Play a lottery!");
        System.out.println("You get this balls:");
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUMBERS_OF_LOTTERY_BALLS; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
