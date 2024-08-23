package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();

        Ball firstRandomBall = lottery.getRandomBall();
        Ball secondRandomBall = lottery.getRandomBall();
        Ball thirdRandomBall = lottery.getRandomBall();

        System.out.println(firstRandomBall);
        System.out.println(secondRandomBall);
        System.out.println(thirdRandomBall);
    }
}
