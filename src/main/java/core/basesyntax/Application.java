package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Ball randBall = Lottery.getRandomBall();
            System.out.println(randBall);
        }
        // create three balls using class Lottery and print information about them in console
    }
}
