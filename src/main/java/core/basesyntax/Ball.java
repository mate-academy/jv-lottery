package core.basesyntax;
import java.util.Random;

public class Ball {
   public static class ballParameters {
    String color;
    int number;
    ballParameters(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Color is " + color + " and number is " + number;
    }
}
    public static class Lottery {
        
        public String getRandomBall() {
            int number = new Random().nextInt(100);
            ColorSupplier colorSupplier = new ColorSupplier();
            String color = colorSupplier.getRandomColor();
            return new ballParameters(color, number).toString();
    } 
    }
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
