package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;

    public static void main(String[] args) {
        Application application = new Application();
        Lottery lottery = new Lottery();
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            application.printBall(lottery.getRandomBall());
        }
    }

    private void printBall(Ball ball) {
        int number = ball.getNumber();
        String additionalZero = "";
        if (number < 10) {
            additionalZero += 0;
        }
        System.out.println("Ball: " + additionalZero + number + " " + ball.getColor());
    }
}
