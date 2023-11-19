package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball[] loterryBalls = new Ball[3];
        for (int i = 0; i < 3; i++) {
            loterryBalls[i] = lottery.returnRandomBall();
            System.out.println(loterryBalls[i].toString());
        }
    }
}
