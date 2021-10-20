package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball firstBall = new Lottery().getRandomBall();
        Ball secondBall = new Lottery().getRandomBall();
        Ball thirdBall = new Lottery().getRandomBall();
        System.out.println("First ball. Color - " + firstBall.getColor() + ", number - "
                + firstBall.getNumber() + ".");
        System.out.println("Second ball. Color - " + secondBall.getColor() + ", number - "
                + secondBall.getNumber() + ".");
        System.out.println("Third ball. Color - " + thirdBall.getColor() + ", number - "
                + thirdBall.getNumber() + ".");
    }
}
