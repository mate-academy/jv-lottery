package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();
        System.out.println(ball1.getColor() + " " + ball1.getNumber());
        System.out.println(ball2.getColor() + " " + ball2.getNumber());
        System.out.println(ball3.getColor() + " " + ball3.getNumber());
    }
}
