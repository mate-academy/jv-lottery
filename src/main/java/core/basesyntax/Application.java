package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball[] arrayOfBalls = new Ball[NUMBER_OF_BALLS];

        for (int i = 0; i < arrayOfBalls.length; i++) {
            arrayOfBalls[i] = lottery.getRandomBall();
            System.out.println(arrayOfBalls[i].toString());
        }
    }
}
