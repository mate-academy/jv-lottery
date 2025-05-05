package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball[] setOfBalls = new Ball[3];
        Lottery lottery = new Lottery();
        for (int i = 0; i < setOfBalls.length; i++) {
            setOfBalls[i] = lottery.getRandomBall();
            System.out.println(setOfBalls[i].toString());
        }
    }
}
