package core.basesyntax;

public class Application extends Lottery {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ball1 = new Lottery();
        ball1 = ball1.getRandomBall();
        System.out.println(ball1);

        Lottery ball2 = new Lottery();
        ball2 = ball2.getRandomBall();
        System.out.println(ball2);

        Lottery ball3 = new Lottery();
        ball3 = ball3.getRandomBall();
        System.out.println(ball3);

    }

}
