package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball ball1 = Lottery.getRandomBall();
        Ball ball2 = Lottery.getRandomBall();
        Ball ball3 = Lottery.getRandomBall();

        System.out.println("Number : " + ball1.getNumbers() + ", " + "Color : " + ball1.getColor());
        System.out.println("Number : " + ball2.getNumbers() + ", " + "Color : " + ball2.getColor());
        System.out.println("Number : " + ball3.getNumbers() + ", " + "Color : " + ball3.getColor());
    }
}
