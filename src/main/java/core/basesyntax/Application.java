package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery createBall = new Lottery();
        Ball firstBall = createBall.getRandomBall();
        Ball secondBall = createBall.getRandomBall();
        Ball thirdBall = createBall.getRandomBall();
        System.out.println(firstBall.toString());
        System.out.println(secondBall.toString());
        System.out.println(thirdBall.toString());
        // create three balls using class Lottery and print information about them in console
    }
}
