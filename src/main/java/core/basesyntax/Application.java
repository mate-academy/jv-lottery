package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        int numbersOfBalls = 3; //для обрання кількості куль (за умовою повинно бути 3)
        Ball[] balls = new Ball[numbersOfBalls];
        for (int i = 0; i < numbersOfBalls; i++) {
            balls[i] = Lottery.getRandomBall();
        }

        for (int i = 0; i < numbersOfBalls; i++) {
            System.out.println("Ball " + (i + 1) + ": " + balls[i]);
        }
    }
}
