package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball_1 = new Lottery();
        Lottery ball_2 = new Lottery();
        Lottery ball_3 = new Lottery();

        System.out.println("ball 1 = " + ball_1.getRandomBall());
        System.out.println("ball 2 = " + ball_2.getRandomBall());
        System.out.println("ball 3 = " + ball_3.getRandomBall());
    }
}
