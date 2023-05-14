package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        System.out.println("Play a lottery!");
        System.out.println("You get this balls:");

        for (int i = 0; i < 3; i++) {
            Lottery lottery = new Lottery();
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
