package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery
        // and print information about them in console

        Ball testball = new Ball();
        testball.setColor(ColorSupplier.getRandomColor());
        testball.setNumber(Lotery.getRandomBall());
        System.out.println(testball.toString());

        Ball testball1 = new Ball();
        testball1.setColor(ColorSupplier.getRandomColor());
        testball1.setNumber(Lotery.getRandomBall());
        System.out.println(testball1.toString());

        Ball testball2 = new Ball();
        testball2.setColor(ColorSupplier.getRandomColor());
        testball2.setNumber(Lotery.getRandomBall());
        System.out.println(testball2.toString());
    }
}
