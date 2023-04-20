package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        System.out.println("First " + new Lottery().getRandomBall().toString());
        System.out.println("Second " + new Lottery().getRandomBall().toString());
        System.out.println("Third " + new Lottery().getRandomBall().toString());
    }
}
