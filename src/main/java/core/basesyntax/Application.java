package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(colorSupplier);
        
        Ball randomBall1 = lottery.getRandomBall();
        Ball randomBall2 = lottery.getRandomBall();
        Ball randomBall3 = lottery.getRandomBall();

        System.out.println("Random Ball 1: " + randomBall1);
        System.out.println("Random Ball 2: " + randomBall2);
        System.out.println("Random Ball 3: " + randomBall3);
    }
}
