package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        int numberOfBallsInLottery = 3;
        Lottery lottery = new Lottery();
        Ball[] ballArray = new Ball[numberOfBallsInLottery];
        for (int i = 0; i < ballArray.length; ++i) {
            ballArray[i] = lottery.getRandomBall();
        }
        for (Ball ball : ballArray) {
            System.out.println(ball);
        }
    }
}
