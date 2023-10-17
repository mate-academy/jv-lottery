package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery lottery = new Lottery();
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();
        System.out.println("Random ball1: " + ball1);
        System.out.println("Random ball2: " + ball2);
        System.out.println("Random ball3: " + ball3);

    }
}
