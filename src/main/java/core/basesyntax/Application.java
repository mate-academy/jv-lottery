package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        String ball1 = "What is our first ball? " + lottery.getRandomBall();
        String ball2 = "What is our second ball? " + lottery.getRandomBall();
        String ball3 = "What is our third ball? " + lottery.getRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        // create three balls using class Lottery and print information about them in console
    }
}
