package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();

        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        Ball ball3 = new Ball();

        System.out.println(lottery.getRandomBall(ball1));
        System.out.println(lottery.getRandomBall(ball2));
        System.out.println(lottery.getRandomBall(ball3));



    }
}
