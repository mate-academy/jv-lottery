package core.basesyntax;

public class Application {
    public void main(String[] args) {
        Lottery[] someBalls = new Lottery[3];
        for (int i = 0; i < someBalls.length; i++) {
            someBalls[i] = new Lottery();
            System.out.println(someBalls[i].getRandomBall());
        }
        // create three balls using class Lottery and print information about them in console
    }
}
