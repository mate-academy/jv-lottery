package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numbersOfBalls = 3; // Number of balls (should be 3 according to the requirements)

        Lottery lottery = new Lottery();

        for (int i = 0; i < numbersOfBalls; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println("Ball " + (i + 1) + ": " + ball);
        }
    }
}

