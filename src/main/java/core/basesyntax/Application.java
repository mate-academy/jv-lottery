package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery= new Lottery();
        for (int i = 0; i < 6; i++) {
            Ball ball1 = lottery.getRandomBall();
            System.out.println(ball1);
        }
        // create three balls using class Lottery and print information about them in console
    }
}
