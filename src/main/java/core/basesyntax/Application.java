package core.basesyntax;

public class Application {

    private static Lottery lottery = new Lottery();

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball earth = lottery.getRandomBall();
        Ball mars = lottery.getRandomBall();
        Ball moon = lottery.getRandomBall();
        System.out.println("Earth = " + earth.toString());
        System.out.println("Mars = " + mars.toString());
        System.out.println("Moon = " + moon.toString());
    }

}
