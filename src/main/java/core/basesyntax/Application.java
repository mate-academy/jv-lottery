package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        final Ball[] magicBalls = new Ball[3];
        for (int i = 0; i < magicBalls.length; i++) {
            magicBalls[i] = lottery.getRandomBall();
            System.out.println(magicBalls[i]);
        }
    }
}
