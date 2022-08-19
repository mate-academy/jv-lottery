package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        final int Number_Of_lotteryBalls = 3;
        Lottery luckyBall = new Lottery();
        for (int i = 0; i < Number_Of_lotteryBalls; i++) {
            System.out.println(luckyBall.getRandomBall());
        }
    }
}
