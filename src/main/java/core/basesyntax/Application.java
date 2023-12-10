package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ballOne = new Lottery();
        Lottery ballTwo = new Lottery();
        Lottery ballThree = new Lottery();

        System.out.println(ballOne.getRandomBall().toString());
        System.out.println(ballTwo.getRandomBall().toString());
        System.out.println(ballThree.getRandomBall().toString());
    }
}
