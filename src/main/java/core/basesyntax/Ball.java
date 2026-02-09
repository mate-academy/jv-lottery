package core.basesyntax;
import java.util.Random;

public class Ball {
    String color;
    int number;
    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }
    @Override
    public String toString() {
        return "Color is " + color + " and number is " + number;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}

class Lottery {
    public Ball getRandomBall() {
            int number = new Random().nextInt(1, 101);
            ColorSupplier colorSupplier = new ColorSupplier();
            String color = colorSupplier.getRandomColor();
            return new Ball(color, number);
    } 
    }
    
