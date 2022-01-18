package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery1 = new Lottery();
        System.out.println("Ball number 1:" + lottery1.getRandomBall().toString());
        Lottery lottery2 = new Lottery();
        System.out.println("Ball number 2:" + lottery2.getRandomBall().toString());
        Lottery lottery3 = new Lottery();
        System.out.println("Ball number 3:" + lottery3.getRandomBall().toString());
    }
}
