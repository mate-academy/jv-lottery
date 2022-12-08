package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        System.out.println("Color ball: " + ColorSupplier.getRandomColor() + ", number: "
                + Lottery.getRandomBall());
    }
    // create three balls using class Lottery and print information about them in console
}

