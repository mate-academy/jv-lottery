package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        int count = 3;
        // not sure if you wanted to see static method in the Lottery class
        Lottery lottery = new Lottery();

        for (int i = 0; i < count; i++) {
            // technically I created three balls :-)
            // not sure if you wanted to see an array with the Ball objects
            System.out.println("Ball[" + i + "] = " + lottery.getRandomBall());
        }
    }
}
