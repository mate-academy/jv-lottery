package core.lottery;

import java.util.Random;

public class Lottery {
    private ColorSupplier colorSupplier;
    private int number;
        
    public Lottery() {
        colorSupplier = new ColorSupplier();
    }
     
    public Ball getRandomBall() {
        generateNumber();
        return new Ball(number + 1, colorSupplier.getRandomColor());
    }
        
    private void generateNumber() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }
}
