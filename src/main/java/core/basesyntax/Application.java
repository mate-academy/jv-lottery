package core.basesyntax;

public class Application {
    private static final int NUMBER_OF_BALLS = 3;
    
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        Lottery lottery = new Lottery(colorSupplier);
        
        for (int i = 0; i < NUMBER_OF_BALLS; i++) {
            Ball randomBall = lottery.getRandomBall();
            System.out.println("Random Ball: " + randomBall);
        }
    }
}
