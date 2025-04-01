package core.basesyntax;

public class Application extends Ball {
    public static void main(String[] args) {

        System.out.println(Lottery.getRandomBall(Ball.getColor(), Ball.getNumber()));

        System.out.println(Lottery.getRandomBall(Ball.getColor(), Ball.getNumber()));

        System.out.println(Lottery.getRandomBall(Ball.getColor(), Ball.getNumber()));

        // create three balls using class Lottery and print information about them in console
    }
}
