package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball first = new Lottery().getRandomBall();
        Ball second = new Lottery().getRandomBall(); //it is possible to do the same through a cycle
        Ball third = new Lottery().getRandomBall();

        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
    }
}
