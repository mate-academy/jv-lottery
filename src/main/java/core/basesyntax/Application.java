package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        System.out.println("Play a lottery!");
        System.out.println("You get this balls:");
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
