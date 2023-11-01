package core.basesyntax;



public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        String first = new Lottery().getRandomBall().toString();
        String second = new Lottery().getRandomBall().toString();
        String third = new Lottery().getRandomBall().toString();
        System.out.println(first + second + third);
    }
}
