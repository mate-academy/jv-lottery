package core.basesyntax;

public class Application {

    public static void main(String[] args) {

        Lottery lot1 = new Lottery();
        Ball ball1 = lot1.getRandomBall();
        Lottery lot2 = new Lottery();
        Ball ball2 = lot2.getRandomBall();
        Lottery lot3 = new Lottery();
        Ball ball3 = lot3.getRandomBall();

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());

    }
}
