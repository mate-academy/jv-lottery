package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        int ballCount = 3;
        Ball[] ballArray = new Ball[ballCount];
        for (int i = 0; i < ballCount; i++) {
            ballArray[i] = lottery.getRandomBall();
        }
        for (Ball ball : ballArray) {
            System.out.println(ball);
        }
    }
}
