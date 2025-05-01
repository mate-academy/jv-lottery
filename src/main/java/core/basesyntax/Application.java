package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;  // Define the constant

    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < NUMBER_OF_BALLS; i++) {  // Use the constant
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}