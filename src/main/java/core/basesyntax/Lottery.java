package core.basesyntax;
public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        Random randomedNumber = new Random();
        int indexOfNumber = randomedNumber.nextInt(101);
        return new Ball(randomColor,randomedNumber);
    }
}

/*import java.util.Random;

public class Lottery {
     ColorSupplier colorSupplier = new ColorSupplier();
     Random random = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = random.nextInt(100) + 1; 
        return new Ball(color, number);
    }
}*/
