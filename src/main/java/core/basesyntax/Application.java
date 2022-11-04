package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ball1 = new Lottery();
        ball1.getRandomBall();
        System.out.println(ball1.getRandomBall());
        Lottery ball2 = new Lottery();
        ball2.getRandomBall();
        System.out.println(ball2.getRandomBall());
        Lottery ball3 = new Lottery();
        ball3.getRandomBall();
        System.out.println(ball3.getRandomBall());
    }
}
