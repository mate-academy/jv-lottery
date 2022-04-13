package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball1 = new Lottery();
        Lottery ball2 = new Lottery();
        Lottery ball3 = new Lottery();

        System.out.println("ball 1 = " + ball1.getRandomBall());
        System.out.println("ball 2 = " + ball2.getRandomBall());
        System.out.println("ball 3 = " + ball3.getRandomBall());
    }
}
