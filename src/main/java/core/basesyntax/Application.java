package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery ballExample = new Lottery();
        String ball1 = ballExample.getRandomBall().toString();
        String ball2 = ballExample.getRandomBall().toString();
        String ball3 = ballExample.getRandomBall().toString();
        System.out.println("1 " + ball1 + "\n2 " + ball2 + "\n3 " + ball3);
    }
}
