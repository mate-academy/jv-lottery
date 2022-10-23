package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball randomBall = lottery.getRandomBall();
            System.out.println(randomBall.getColour() + " " + randomBall.getNumber());
        }
    }
}
