package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball[] ballArray = new Ball[3];
        for (int i = 0; i < ballArray.length; ++i) {
            ballArray[i] = lottery.getRandomBall();
        }
        for (Ball ball : ballArray) {
            System.out.println(ball.toString());
        }
    }
}
