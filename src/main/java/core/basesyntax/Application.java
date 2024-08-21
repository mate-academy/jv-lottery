package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Colors ball1 = lottery.getRandomBall();
        Colors ball2 = lottery.getRandomBall();
        Colors ball3 = lottery.getRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}



