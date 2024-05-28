package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();

        System.out.println("First ball: " + ball1);
        System.out.println("Second ball: " + ball2);
        System.out.println("Third ball: " + ball3);
    }
}
