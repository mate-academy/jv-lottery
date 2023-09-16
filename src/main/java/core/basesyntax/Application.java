package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        
        Lottery lottery = new Lottery(colorSupplier);

        Ball randomBall = lottery.getRandomBall();
        System.out.println("Random Ball: " + randomBall);

    }
}
// lottery created with full functianality  eval "$(ssh-agent -s)"
//