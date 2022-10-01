package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ballNumberOne = new Lottery().getRandomBall();
        Ball ballNumberTwo = new Lottery().getRandomBall();
        Ball ballNumberThree = new Lottery().getRandomBall();
        System.out.println(ballNumberOne.toString());
        System.out.println(ballNumberTwo.toString());
        System.out.println(ballNumberThree.toString());
    }
}
